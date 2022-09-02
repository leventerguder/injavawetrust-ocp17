# Exam Essentials

**Be able to write thread-safe code.**

Thread-safety is about protecting shared data from concurrent access. A monitor can be used to ensure that only one
thread processes a particular section of code at a time. In Java, monitors can be implemented with a synchronized block
or method or using an instance of Lock. ReentrantLock has a number of advantages over using a synchronized block,
including the ability to check whether a lock is available without blocking it, as well as supporting the fair
acquisition of locks. To achieve synchronization, two or more threads must coordinate on the same shared object.

**Be able to apply the atomic classes.**

An atomic operation is one that occurs without interference from another thread. The Concurrency API includes a set of
atomic classes that are similar to the primitive classes, except that they ensure that operations on them are performed
atomically. Know the difference between an atomic variable and one marked with the volatile modifier.

**Create concurrent tasks with a thread executor service using Runnable and Callable.**

An ExecutorService creates and manages a single thread or a pool of threads. Instances of Runnable and Callable can both
be submitted to a thread executor and will be completed using the available threads in the service. Callable differs
from Runnable in that Callable returns a generic data type and can throw a checked exception. A ScheduledExecutorService
can be used to schedule tasks at a fixed rate or with a fixed interval between executions.

**Be able to use the concurrent collection classes.**

The Concurrency API includes numerous collection classes that include built-in support for multithreaded processing,
such as ConcurrentHashMap. It also includes a class CopyOnWriteArrayList that creates a copy of its underlying list
structure every time it is modified and is useful in highly concurrent environments.

**Identify potential threading problems.**

Deadlock, starvation, and livelock are three threading problems that can occur and result in threads never completing
their task. Deadlock occurs when two or more threads are blocked forever. Starvation occurs when a single thread is
perpetually denied access to a shared resource. Livelock is a form of starvation where two or more threads are active
but conceptually blocked forever. Finally, race conditions occur when two threads execute at the same time, resulting
in an unexpected outcome.

**Understand the impact of using parallel streams.**

The Stream API allows for the easy creation of parallel streams. Using a parallel stream can cause unexpected results,
since the order of operations may no longer be predictable. Some operations, such as reduce() and collect(), require
special consideration to achieve optimal performance when applied to a parallel stream.