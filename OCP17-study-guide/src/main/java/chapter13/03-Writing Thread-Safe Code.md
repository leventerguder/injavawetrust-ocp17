# Writing Thread-Safe Code

Thread-safety is the property of an object that guarantees safe execution by multiple threads at the same time. Since
threads run in a shared environment and memory space, how do we prevent two threads from interfering with each other? We
must organize access to data so that we don’t end up with invalid or unexpected results.

## Understanding Thread-Safety

Imagine that our zoo has a program to count sheep, preferably one that won’t put the zoo workers to sleep!

    public class SheepManager {

        private int sheepCount = 0;
        private void incrementAndReport() {
            System.out.print((++sheepCount) + " ");
        }
    
        public static void main(String[] args) {
            ExecutorService service = Executors.newFixedThreadPool(20);
            try {
                SheepManager manager = new SheepManager();
                for (int i = 0; i < 10; i++)
                    service.submit(() -> manager.incrementAndReport());
            } finally {
                service.shutdown();
            }
        }
    }

What does this program output? You might think it will output numbers from 1 to 10, in order, but that is far from
guaranteed. It may output in a different order. Worse yet, it may print some numbers twice and not print some numbers at
all! The following are possible outputs of this program:

    1 2 3 4 5 6 7 8 9 10
    1 9 8 7 3 6 6 2 4 5
    5 9 10 6 2 4 7 1 3 8 

So, what went wrong? In this example, we use the pre-increment (++) operator to update the sheepCount variable. A
problem occurs when two threads both execute the right side of the expression, reading the “old” value before either
thread writes the “new” value of the variable. The two assignments become redundant; they both assign the same new
value, with one thread overwriting the results of the other. Figure 13.4 demonstrates this problem with two threads,
assuming that sheepCount has a starting value of 1.

![](writingthreadsafecode/Lack-of-synchronization.png)

You can see in Figure 13.4 that both threads read and write the same values, causing one of the two ++sheepCount
operations to be lost. Therefore, the increment operator ++ is not thread-safe. As you will see later in this chapter,
the unexpected result of two tasks executing at the same time is referred to as a race condition.

## Accessing Data with volatile

The volatile keyword is used to guarantee that access to data within memory is consistent. For example, it is
possible (albeit unlikely) that our SheepManager example using ++sheepCount returns an unexpected value due to invalid
memory access while the code is executing a critical section. Conceptually, this corresponds to one of our zoo employees
tripping on the way back from the field and someone asking them the current number of sheep while they are still
trying to get up!

The volatile attribute ensures that only one thread is modifying a variable at one time and that data read among
multiple threads is consistent.

In this manner, we don’t interrupt one of our zoo workers in the middle of running. So, does volatile provide
thread-safety? Not exactly. Consider this replacement to our previous application:

    private int sheepCount = 0;
    private void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

Unfortunately, this code is not thread-safe and could still result in numbers being missed:

    2 6 1 7 5 3 2 9 4 8

The reason this code is not thread-safe is that ++sheepCount is still two distinct operations. Put another way, if the
increment operator represents the expression sheepCount = sheepCount + 1, then each read and write operation is
thread-safe, but the combined operation is not. Referring back to our sheep example, we don’t interrupt the employee
while running, but we could still have multiple people in the field at the same time.

In practice, volatile is rarely used. We only cover it because it has been known to show up on the exam from time to
time.

## Protecting Data with Atomic Classes

In our previous SheepManager applications, the same values were printed twice, with the highest counter being 9 instead
of 10. As we saw, the increment operator ++ is not thread-safe, even when volatile is used. It is not thread-safe
because the operation is not atomic, carrying out two tasks, read and write, that can be interrupted by other threads.

Atomic is the property of an operation to be carried out as a single unit of execution without any interference from
another thread. A thread-safe atomic version of the increment operator would perform the read and write of the variable
as a single operation, not allowing any other threads to access the variable during the operation.

In this case, any thread trying to access the sheepCount variable while an atomic operation is in process will have to
wait until the atomic operation on the variable is complete. Conceptually, this is like setting a rule for our zoo
workers that there can be only one employee in the field at a time, although they may not each report their results in
order.

![](writingthreadsafecode/Thread-synchronization-using-atomic-operations.png)

Since accessing primitives and references is common in Java, the Concurrency API includes numerous useful classes in the
java.util.concurrent.atomic package.

![](writingthreadsafecode/Atomic-classes.png

    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport() {
        System.out.print((sheepCount.incrementAndGet()) + " ");
    }

![](writingthreadsafecode/Common-atomic-methods.png)

How does this implementation differ from our previous examples? When we run this modification, we get varying output,
such as the following:

    2 3 1 4 5 6 7 8 9 10 
    1 4 3 2 5 6 7 8 9 10 
    1 4 3 5 6 2 7 8 10 9

Unlike our previous sample output, the numbers 1 through 10 will always be printed, although the order is still not
guaranteed. Don’t worry; we address that issue shortly. The key in this section is that using the atomic classes ensures
that the data is consistent between workers and that no values are lost due to concurrent modifications.

## Improving Access with synchronized Blocks

While atomic classes are great at protecting a single variable, they aren’t particularly useful if you need to execute a
series of commands or call a method.

The most common technique is to use a monitor to synchronize access.
A monitor, also called a lock, is a structure that supports mutual exclusion, which is the property that at most one
thread is executing a particular segment of code at a given time.

In Java, any Object can be used as a monitor, along with the synchronized keyword, as shown in the following example:

    var manager = new SheepManager();
    synchronized(manager) {
        // Work to be completed by one thread at a time
    }

This example is referred to as a synchronized block. Each thread that arrives will first check if any threads are
already running the block. If the lock is not available, the thread will transition to a BLOCKED state until it can
“acquire the lock.” If the lock is available (or the thread already holds the lock), the single thread will enter the
block, preventing all other threads from entering. Once the thread finishes executing the block, it will release the
lock, allowing one of the waiting threads to proceed.

To synchronize access across multiple threads, each thread must have access to the same Object. If each thread
synchronizes on different objects, the code is not thread-safe.

    private int sheepCount = 0;
    private void incrementAndReport() {
        synchronized(this) { 
            System.out.print((++sheepCount)+" ");
        }
    }


    1 2 3 4 5 6 7 8 9 10 

Although all threads are still created and executed at the same time, they each wait at
the synchronized block for the worker to increment and report the result before entering. In this manner, each zoo
worker waits for the previous zoo worker to come back before running out on the field. While it’s random which zoo
worker will run out next, it is guaranteed that there will be at most one on the field and that the results will be
reported in order.

    private final Object herd = new Object();
    private void incrementAndReport() {
        synchronized(herd) {
            System.out.print((++sheepCount)+" ");
        }
    }

## Synchronizing on Methods

In the previous example, we established our monitor using synchronized(this) around the body of the method. Java
provides a more convenient compiler enhancement for doing so. We can add the synchronized modifier to any instance
method to synchronize automatically on the object itself. For example, the following two method definitions are
equivalent:

    void singV1() {
        synchronized(this) {
            System.out.print("La la la!");
        }
    }
    
    synchronized void singV2() {
        System.out.print("La la la!"); 
    }

The first uses a synchronized block, whereas the second uses the synchronized method modifier. Which you use is
completely up to you.

We can also apply the synchronized modifier to static methods. What object is used as the monitor when we synchronize on
a static method? The class object, of course! For example, the following two methods are equivalent for static
synchronization inside our SheepManager class:

    static void danceV1() {
        synchronized (SheepManager.class) {
            System.out.print("Time to dance!");
        }
    }

    static synchronized void danceV2() {
        System.out.print("Time to dance!");
    }

As before, the first uses a synchronized block, with the second example using the synchronized modifier. You can use
static synchronization if you need to order thread access across all instances rather than a single instance.

## Understanding the Lock Framework

A synchronized block supports only a limited set of functionality. For example, what if we want to check whether a lock
is available and, if it is not, perform some other task? Further- more, if the lock is never available and we
synchronize on it, we might wait forever.

The Concurrency API includes the Lock interface, which is conceptually similar to using the synchronized keyword but
with a lot more bells and whistles. Instead of synchronizing on any Object, though, we can “lock” only on an object that
implements the Lock interface.

### Applying a ReentrantLock

The Lock interface is pretty easy to use. When you need to protect a piece of code from multithreaded processing, create
an instance of Lock that all threads have access to. Each thread then calls lock() before it enters the protected code
and calls unlock() before it exits the protected code.

For contrast, the following shows two implementations, one with a synchronized block and one with a Lock instance. While
longer, the Lock solution has a number of features not available to the synchronized block.

    // Implementation #1 with a synchronized block
    
    Object object = new Object(); 
    synchronized(object) {
        // Protected code
    }

    // Implementation #2 with a Lock

    Lock lock = new ReentrantLock();
    try {
        lock.lock();
        // Protected code
    } finally {
        lock.unlock();
    }

These two implementations are conceptually equivalent. The ReentrantLock class is a simple monitor that implements the
Lock interface and supports mutual exclusion. In other words, at most one thread is allowed to hold a lock at any given
time.

While certainly not required, it is a good practice to use a try/finally block with Lock instances. Doing so ensures
that any acquired locks are properly released.

The ReentrantLock class ensures that once a thread has called lock() and obtained the lock, all other threads that call
lock() will wait until the first thread calls unlock(). Which thread gets the lock next depends on the parameters used
to create the Lock object.

The ReentrantLock class includes a constructor that takes a single boolean and sets
a “fairness” parameter. If the parameter is set to true, the lock will usually be granted to each thread in the order in
which it was requested. It is false by default when using the no-argument constructor. In practice, you should enable
fairness only when ordering is absolutely required, as it could lead to a significant slowdown.

Besides always making sure to release a lock, you also need to be sure that you only release a lock that you have. If
you attempt to release a lock that you do not have, you will get an exception at runtime.

    Lock lock = new ReentrantLock();
    lock.unlock(); // IllegalMonitorStateException

### Attempting to Acquire a Lock

While the ReentrantLock class allows you to wait for a lock, it so far suffers from the same problem as a synchronized
block. A thread could end up waiting forever to obtain a lock

![](writingthreadsafecode/Lock-methods.png)

**tryLock**

The tryLock() method will attempt to acquire a lock and immediately return a boolean result indicating whether the lock
was obtained. Unlike the lock() method, it does not wait if another thread already holds the lock. It returns
immediately, regardless of whether a lock is available.

    public class ReentrantLockTryLock {
    
        public static void main(String[] args) {
    
            Lock lock = new ReentrantLock();
            new Thread(() -> printHello(lock)).start();
            if (lock.tryLock()) {
                try {
                    System.out.println("Lock obtained, entering protected code");
                } finally {
                    lock.unlock();
                }
            } else {
                System.out.println("Unable to acquire lock, doing something else");
            }
        }
    
        public static void printHello(Lock lock) {
            try {
                lock.lock();
                System.out.println("Hello");
            } finally {
                lock.unlock();
            }
        }
    }

**tryLock(long,TimeUnit)**

The Lock interface includes an overloaded version of tryLock(long,TimeUnit) that acts like a hybrid of lock() and
tryLock(). Like the other two methods, if a lock is available, it will immediately return with it. If a lock is
unavailable, though, it will wait up to the specified time limit for the lock.

        if(lock.tryLock(10, TimeUnit.SECONDS)) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }

**Acquiring the Same LockTwice**

The ReentrantLock class maintains a counter of the number of times a lock has been successfully granted to a thread.
To release the lock for other threads to use, unlock() must be called the same number of times the lock was granted. The
following code snippet contains an error. Can you spot it?

    Lock lock = new ReentrantLock(); 
    if(lock.tryLock()) {
        try {
            lock.lock();
            System.out.println("Lock obtained, entering protected code");
            } finally { 
                lock.unlock();
            }
    }

The thread obtains the lock twice but releases it only once. You can verify this by spawning a new thread after this
code runs that attempts to obtain a lock. The following prints false:

    new Thread(() -> System.out.print(lock.tryLock())).start(); // false

It is critical that you release a lock the same number of times it is acquired! For calls with
tryLock(), you need to call unlock() only if the method returned true.

## Reviewing the Lock Framework

To review, the ReentrantLock class supports the same features as a synchronized block while adding a number of
improvements:

- Ability to request a lock without blocking.
- Ability to request a lock while blocking for a specified amount of time.
- A lock can be created with a fairness property, in which the lock is granted to threads in the order in which it was
  requested.

While not on the exam, ReentrantReadWriteLock is a really useful class. It includes separate locks for reading and
writing data and is useful on data structures where reads are far more common than writes. For example, if you have a
thousand threads reading data but only one thread writing data, this class can help you maximize concurrent access.

## OrchestratingTasks with a CyclicBarrier

We started the thread-safety topic by discussing protecting individual variables and then moved on to blocks of code and
locks. We complete our discussion of thread-safety by showing how to orchestrate complex tasks with many steps.

Our zoo workers are back, and this time they are cleaning pens. Imagine a lion pen that needs to be emptied, cleaned,
and then refilled with the lions. To complete the task, we have assigned four zoo workers. Obviously, we don’t want to
start cleaning the cage while a lion is roaming in it, lest we end up losing a zoo worker! Furthermore, we don’t want to
let the lions back into the pen while it is still being cleaned.

We could have all of the work completed by a single worker, but this would be slow and ignore the fact that we have
three zoo workers standing by to help. A better solution would be to have all four zoo employees work concurrently,
pausing between the end of one set of tasks and the start of the next.

    import java.util.concurrent.Executors;
    
    public class LionPenManager {
    
        private void removeLions() {
            System.out.println("Removing lions");
        }
    
        private void cleanPen() {
            System.out.println("Cleaning the pen");
        }
    
        private void addLions() {
            System.out.println("Adding lions");
        }
    
        public void performTask() {
            removeLions();
            cleanPen();
            addLions();
        }
    
        public static void main(String[] args) {
            var service = Executors.newFixedThreadPool(4);
            try {
                var manager = new LionPenManager();
                for (int i = 0; i < 4; i++)
                    service.submit(() -> manager.performTask());
            } finally {
                service.shutdown();
            }
        }
    }

Although the results are ordered within a single thread, the output is entirely random among multiple workers. We see
that some lions are still being removed while the cage is being cleaned, and other lions are added before the cleaning
process is finished. Let’s hope none of the zoo workers get eaten!

We can improve these results by using the CyclicBarrier class. The CyclicBarrier takes in its constructors a limit
value, indicating the number of threads to wait for. As each thread finishes, it calls the await() method on the cyclic
barrier. Once the specified number of threads have each called await(), the barrier is released, and all threads can
continue.

    public class LionPenManagerCyclicBarrier {
    
        private void removeLions() {
            System.out.println("Removing lions");
        }
    
        private void cleanPen() {
            System.out.println("Cleaning the pen");
        }
    
        private void addLions() {
            System.out.println("Adding lions");
        }
    
        public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
            try {
                removeLions();
                c1.await();
                cleanPen();
                c2.await();
                addLions();
            } catch (InterruptedException | BrokenBarrierException e) { // Handle checked exceptions here
            }
        }
    
    
        public static void main(String[] args) {
            var service = Executors.newFixedThreadPool(4);
            try {
                var manager = new LionPenManagerCyclicBarrier();
                var c1 = new CyclicBarrier(4);
                var c2 = new CyclicBarrier(4,
                        () -> System.out.println("*** Pen Cleaned!"));
                for (int i = 0; i < 4; i++)
                    service.submit(() -> manager.performTask(c1, c2));
            } finally {
                service.shutdown();
            }
        }
    }

The following is sample output based on this revised implementation of our LionPenManagerCyclicBarrier class:

    Removing lions
    Removing lions
    Removing lions
    Removing lions
    Cleaning the pen
    Cleaning the pen
    Cleaning the pen
    Cleaning the pen
    *** Pen Cleaned!
    Adding lions
    Adding lions
    Adding lions
    Adding lions

As you can see, all of the results are now organized. Removing the lions happens in one step, as does cleaning the pen
and adding the lions back in. In this example, we used two different constructors for our CyclicBarrier objects, the
latter of which executes a Runnable instance upon completion.

The CyclicBarrier class allows us to perform complex, multithreaded tasks while all threads stop and wait at logical
barriers. This solution is superior to a single-threaded solu- tion, as the individual tasks, such as removing the
lions, can be completed in parallel by all four zoo workers.

**Reusing CyclicBarrier**

After a CyclicBarrier limit is reached (aka the barrier is broken), all threads are released, and the number of threads
waiting on the CyclicBarrier goes back to zero. At this point, the CyclicBarrier may be used again for a new set of
waiting threads. For example, if our CyclicBarrier limit is 5 and we have 15 threads that call await(), the
CyclicBarrier will be activated a total of three times.
