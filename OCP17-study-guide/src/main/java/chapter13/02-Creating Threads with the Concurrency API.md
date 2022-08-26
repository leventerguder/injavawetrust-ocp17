# Creating Threads with the Concurrency API

Java includes the java.util.concurrent package, which we refer to as the Concurrency API, to handle the complicated
work of managing threads for you. The Concurrency API includes the ExecutorService interface, which defines services
that create and manage threads.

When writing multithreaded programs in practice, it is often better to use the Concurrency API (or some other
multithreaded SDK) rather than work with Thread objects directly. The libraries are much more robust, and it is easier
to handle complex interactions.

## Introducing the Single-Thread Executor

Since ExecutorService is an interface, how do you obtain an instance of it? The Concurrency API includes the Executors
factory class that can be used to create instances of the ExecutorService object. Let’s rewrite our earlier example with
the two Runnable instances to using an ExecutorService.

    Runnable printInventory = () -> System.out.println("Printing zoo inventory");
    Runnable printRecords = () -> {
        for (int i = 0; i < 3; i++)
            System.out.println("Printing record: " + i);
    };


    ExecutorService service = Executors.newSingleThreadExecutor();
    try {
        System.out.println("begin");
        service.execute(printInventory);
        service.execute(printRecords);
        service.execute(printInventory);
        System.out.println("end");
    } finally {
        service.shutdown();
    }

Notice that the printRecords loop is no longer interrupted by other Runnable tasks sent to the thread executor. With a
single-thread executor, tasks are guaranteed to be executed sequentially. Notice that the end text is output while our
thread executor tasks are still running. This is because the main() method is still an independent thread from the
ExecutorService.

## Shutting Down a Thread Executor

Once you have finished using a thread executor, it is important that you call the shutdown() method. A thread executor
creates a non-daemon thread on the first task that is executed, so failing to call shutdown() will result in your
application never terminating.

The shutdown process for a thread executor involves first rejecting any new tasks submitted to the thread executor
while continuing to execute any previously submitted tasks. During this time, calling isShutdown() will return true,
while isTerminated() will return false.

If a new task is submitted to the thread executor while it is shutting down, a RejectedExecutionException will be
thrown. Once all active tasks have been completed, isShutdown() and isTerminated() will both return true.

![](creatingthreadswiththeconcurrencyapi/ExecutorService-life-cycle.png)

For the exam, you should be aware that shutdown() does not stop any tasks that have already been submitted to the thread
executor.

What if you want to cancel all running and upcoming tasks? The ExecutorService provides a method called shutdownNow(),
which attempts to stop all running tasks and discards any that have not been started yet. It is not guaranteed to
succeed because it is possible to create a thread that will never terminate, so any attempt to interrupt it may be
ignored.

As you learned in Chapter 11, “Exceptions and Localization,” resources such as thread executors should be properly
closed to prevent memory leaks. Unfortunately, the ExecutorService interface does not extend the AutoCloseable
interface, so you cannot use a try-with-resources statement. You can still use a finally block, as we do throughout this
chapter. While you are not required to use a finally block, it is considered a good practice to do so.

## Submitting Tasks

You can submit tasks to an ExecutorService instance multiple ways. The first method we presented, execute(), is
inherited from the Executor interface, which the ExecutorService interface extends.

The execute() method takes a Runnable instance and completes the task asynchronously.
Because the return type of the method is void, it does not tell us anything about the result of the task. It is
considered a “fire-and-forget” method, as once it is submitted, the results are not directly available to the calling
thread.

Fortunately, the writers of Java added submit() methods to the ExecutorService interface, which, like execute(), can be
used to complete tasks asynchronously. Unlike execute(), though, submit() returns a Future instance that can be used to
determine whether the task is complete. It can also be used to return a generic result object after the task has been
completed.

In practice, using the submit() method is quite similar to using the execute() method, except that the submit() method
returns a Future instance that can be used to determine whether the task has completed execution.

![](creatingthreadswiththeconcurrencyapi/ExecutorService-methods.png)

**Submitting Tasks: execute() vs. submit()**

As you might have noticed, the execute() and submit() methods are nearly identical when applied to Runnable expressions.
The submit() method has the obvious advantage of doing the same thing execute() does, but with a return object that can
be used to track the result. Because of this advantage and the fact that execute() does not support Callable
expressions, we tend to prefer submit() over execute(), even if we don’t store the Future reference.

For the exam, you need to be familiar with both execute() and submit(), but in your own code we recommend submit() over
execute() whenever possible.

## Waiting for Results

How do we know when a task submitted to an ExecutorService is complete? As mentioned in the previous section, the
submit() method returns a Future<V> instance that can be used to determine this result.

    Future<?> future = service.submit(() -> System.out.println("Hello"));

The Future type is actually an interface. For the exam, you don’t need to know any of the classes that implement Future,
just that a Future instance is returned by various API methods.

![](creatingthreadswiththeconcurrencyapi/Future-methods.png)

    public class CheckResults {
        private static int counter = 0;
    
        public static void main(String[] unused) throws Exception {
            ExecutorService service = Executors.newSingleThreadExecutor();
            try {
                Future<?> result = service.submit(() -> {
                    for (int i = 0; i < 1_000_000; i++) counter++;
                }
                );
                result.get(10, TimeUnit.SECONDS); // Returns null for Runnable
                System.out.println("Reached!");
            } catch (TimeoutException e) {
                System.out.println("Not reached in time");
            } finally {
                service.shutdown();
            }
        }
    }

This example is similar to our earlier polling implementation, but it does not use the Thread class directly. In part,
this is the essence of the Concurrency API: to do complex things with threads without having to manage threads directly.
It also waits at most 10 seconds, throwing a TimeoutException on the call to result.get() if the task is not done.

What is the return value of this task? As Future<V> is a generic interface, the type V is determined by the return type
of the Runnable method. Since the return type of Runnable.run() is void, the get() method always returns null when
working with Runnable expressions.

The Future.get() method can take an optional value and enum type java.util.concurrent.TimeUnit. Table 13.3 presents the
full list of TimeUnit values since numerous methods in the Concurrency API use this enum.

![](creatingthreadswiththeconcurrencyapi/TimeUnit-values.png)

## Introducing Callable

The java.util.concurrent.Callable functional interface is similar to Runnable except that its call() method returns a
value and can throw a checked exception. The following is the definition of the Callable interface:

    @FunctionalInterface 
    public interface Callable<V> { 
        V call() throws Exception;
    }

The Callable interface is often preferable over Runnable, since it allows more details to be retrieved easily from the
task after it is completed.

Luckily, the ExecutorService includes an overloaded version of the submit() method that takes a Callable object and
returns a generic Future<T> instance.

Unlike Runnable, in which the get() methods always return null, the get() methods on a Future instance return the
matching generic type (which could also be a null value).

    var service = Executors.newSingleThreadExecutor();
    try {
        Future<Integer> result = service.submit(() -> 30 + 11);
        System.out.println(result.get()); // 41
        service.shutdown();
    } finally {
        service.shutdown();
    }