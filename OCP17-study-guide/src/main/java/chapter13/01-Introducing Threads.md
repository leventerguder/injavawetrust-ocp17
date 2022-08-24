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