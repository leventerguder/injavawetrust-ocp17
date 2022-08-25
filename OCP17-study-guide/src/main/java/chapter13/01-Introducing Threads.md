# Concurrency

Luckily, all operating systems support what is known as multithreaded processing. The idea behind multithreaded
processing is to allow an application or group of applications to execute multiple tasks at the same time. This allows
tasks waiting for other resources to give way to other processing requests.

In this chapter, we introduce you to the concept of threads and provide numerous ways to manage threads using the
Concurrency API. Threads and concurrency are challenging topics for many programmers to grasp, as problems with threads
can be frustrating even for veteran developers. In practice, concurrency issues are among the most difficult problems to
diagnose and resolve.

# Introducing Threads

A thread is the smallest unit of execution that can be scheduled by the operating system.
A process is a group of associated threads that execute in the same shared environment.
It follows, then, that a single-threaded process is one that contains exactly one thread, whereas a multi- threaded
process supports more than one thread.

By shared environment, we mean that the threads in the same process share the same memory space and can communicate
directly with one another.

A task is a single unit of work performed by a thread. Throughout this chapter, a task will commonly be implemented as a
lambda expression. A thread can complete multiple independent tasks but only one task at a time.

## Understanding Thread Concurrency

The property of executing multiple threads and processes at the same time is referred to as concurrency.
How does the system decide what to execute when there are more threads available than CPUs? Operating systems use a
thread scheduler to determine which threads should be currently executing.
For example, a thread scheduler may employ a round-robin schedule in which each available thread receives an equal
number of CPU cycles with which to execute, with threads visited in a circular order.

When a thread’s allotted time is complete but the thread has not finished processing, a context switch occurs. A context
switch is the process of storing a thread’s current state and later restoring the state of the thread to continue
execution. Be aware that a cost is often associated with a context switch due to lost time and having to reload a
thread’s state. Intelligent thread schedulers do their best to minimize the number of context switches while keeping
an application running smoothly.

Finally, a thread can interrupt or supersede another thread if it has a higher thread priority than the other thread.
A thread priority is a numeric value associated with a thread that is taken into consideration by the thread scheduler
when determining which threads should currently be executing. In Java, thread priorities are specified as integer
values.

## Creating a Thread

One of the most common ways to define a task for a thread is by using the Runnable instance. Runnable is a functional
interface that takes no arguments and returns no data.

    @FunctionalInterface 
    public interface Runnable { 
        void run();
    }

With this, it’s easy to create and start a thread. In fact, you can do so in one line of code using the Thread class:

    new Thread(() -> System.out.print("Hello")).start(); 
    System.out.print("World");

The first line creates a new Thread object and then starts it with the start() method. Does this code print HelloWorld
or WorldHello? The answer is that we don’t know. Depending on the thread priority/scheduler, either is possible.
Remember that order of thread execution is not often guaranteed. The exam commonly presents questions in which multiple
tasks are started at the same time, and you must determine the result.

Let’s take a look at a more complex example:

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.println("end");

The answer is that it is unknown until runtime.
This sample uses a total of four threads: the main() user thread and three additional threads created.

Each thread created on these lines is executed as an asynchronous task. By asynchronous, we mean that the thread
executing the main() method does not wait for the results of each newly created thread before continuing.

While the order of thread execution is indeterminate once the threads have been started, the order within a single
thread is still linear. In particular, the for() loop is still ordered. Also, begin always appears before end.

**Calling run() Instead of start()**

On the exam, be mindful of code that attempts to start a thread by calling run() instead of start(). Calling run() on a
Thread or a Runnable does not start a new thread. While the following code snippets will compile, none will execute a
task on a separate thread:

    System.out.println("begin");
    new Thread(printInventory).run();
    new Thread(printRecords).run();
    new Thread(printInventory).run();
    System.out.println("end");

Unlike the previous example, each line of this code will wait until the run() method is complete before moving on to the
next line. Also unlike the previous program, the output for this code sample will be the same every time it is executed.

More generally, we can create a Thread and its associated task one of two ways in Java:

- Provide a Runnable object or lambda expression to the Thread constructor.
- Create a class that extends Thread and overrides the run() method.

## Distinguishing Thread Types

It might surprise you that all Java applications, including all of the ones that we have presented in this book, are
multithreaded because they include system threads.

A system thread is created by the Java Virtual Machine (JVM) and runs in the background of the application.
For example, garbage collection is managed by a system thread created by the JVM.

Alternatively, a user-defined thread is one created by the application developer to accomplish a specific task.
The majority of the programs we’ve presented so far have contained only one user-defined thread, which calls the main()
method. For simplicity, we commonly refer to programs that contain only a single user-defined thread as
single-threaded applications.

System and user-defined threads can both be created as daemon threads. A daemon thread is one that will not prevent the
JVM from exiting when the program finishes. A Java application terminates when the only threads that are running are
daemon threads. For example, if garbage collection is the only thread left running, the JVM will automatically shut
down.

    public class Zoo {
    
        public static void pause() { // Defines the thread task
            try {
                Thread.sleep(10_000); // Wait for 10 seconds
            } catch (InterruptedException e) {
            }
            System.out.println("Thread finished!");
        }
    
        public static void main(String[] args) {
            var job = new Thread(() -> pause()); // Create thread
            job.start();
            System.out.println("Main method finished!");
        }
    }

The program will output two statements roughly 10 seconds apart:

    Main method finished!
    --- 10 second wait ---
    Thread finished!

That’s right. Even though the main() method is done, the JVM will wait for the user thread to be done before ending the
program. What if we change job to be a daemon thread

    job.setDaemon(true);

The program will print the first statement and terminate without ever printing the second line.

    Main method finished!

For the exam, just remember that by default, user-defined threads are not daemons, and the program will wait for them to
finish.

## Managing a Thread’s Life Cycle

After a thread has been created, it is in one of six states, shown in Figure 13.2. You can query a thread’s state by
calling getState() on the thread object.

![](introducingthreads/Thread-states.png)

Every thread is initialized with a NEW state. As soon as start() is called, the thread is moved to a RUNNABLE state.
Does that mean it is actually running? Not exactly: it may be running, or it may not be. The RUNNABLE state just means
the thread is able to be run. Once the work for the thread is completed or an uncaught exception is thrown, the thread
state becomes TERMINATED, and no more work is performed.

While in a RUNNABLE state, the thread may transition to one of three states where it pauses its work: BLOCKED, WAITING,
or TIMED_WAITING. This figure includes common transitions between thread states, but there are other possibilities.
For example, a thread in a WAITING state might be triggered by notifyAll(). Likewise, a thread that is interrupted by
another thread will exit TIMED_WAITING and go straight back into RUNNABLE.

We cover some (but not all) of these transitions in this chapter. Some thread-related methods—such as wait(), notify(),
and join()—are beyond the scope of the exam and, frankly, difficult to use well. You should avoid them and use the
Concurrency API as much as possible. It takes a large amount of skill (and some luck!) to use these methods correctly.

## Polling with Sleep

Even though multithreaded programming allows you to execute multiple tasks at the same time, one thread often needs to
wait for the results of another thread to proceed. One solution is to use polling. Polling is the process of
intermittently checking data at some fixed interval.

Let’s say you have a thread that modifies a shared static counter value, and your
main() thread is waiting for the thread to reach 1 million:

    public class CheckResults {
        private static int counter = 0;
    
        public static void main(String[] args) {
            new Thread(() -> {
                for (int i = 0; i < 1_000_000; i++) counter++;
            }).start();
            while (counter < 1_000_000) {
                System.out.println("Not reached yet");
            }
            System.out.println("Reached: " + counter);
        }
    }

How many times does this program print Not reached yet? The answer is, we don’t know! It could output 0, 10, or a
million times. Using a while() loop to check for data without some kind of delay is considered a bad coding practice as
it ties up CPU resources for no reason.

We can improve this result by using the Thread.sleep() method to implement polling and sleep for 1,000 milliseconds, aka
1 second:

    public class CheckResultsWithSleep {
        private static int counter = 0;
    
        public static void main(String[] a) {
            new Thread(() -> {
                for (int i = 0; i < 1_000_000; i++) counter++;
            }).start();
            while (counter < 1_000_000) {
                System.out.println("Not reached yet");
                try {
                    Thread.sleep(1_000); // 1 SECOND
                    System.out.println("Interrupted!");
                } catch (InterruptedException e) {
                    System.out.println("Interrupted!");
                }
            }
            System.out.println("Reached: " + counter);
        }

    }

While one second may seem like a small amount, we have now freed the CPU to do other work instead of checking the
counter variable infinitely within a loop. Notice that the main() thread alternates between TIMED_WAITING and RUNNABLE
when sleep() is entered and exited, respectively.

## Interrupting a Thread

While our previous solution prevented the CPU from waiting endlessly on a while() loop, it did come at the cost of
inserting one-second delays into our program. . If the task takes 2.1 seconds to run, the program will use the full 3
seconds, wasting 0.9 seconds.

One way to improve this program is to allow the thread to interrupt the main() thread when it’s done:

This improved version includes both sleep(), to avoid tying up the CPU, and interrupt(), so the thread’s work ends
without delaying the program. As before, our main() thread’s state alternates between TIMED_WAITING and RUNNABLE.
Calling interrupt() on a thread in the TIMED_WAITING or WAITING state causes the main() thread to become RUNNABLE again,
triggering an InterruptedException. The thread may also move to a BLOCKED state if it needs to reacquire resources when
it wakes up.

Calling interrupt() on a thread already in a RUNNABLE state doesn’t change the state. In fact, it only changes the
behavior if the thread is peri- odically checking the Thread.isInterrupted() value state.