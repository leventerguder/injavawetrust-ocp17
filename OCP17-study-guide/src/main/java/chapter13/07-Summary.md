# Summary

This chapter introduced you to threads and outlined some of the key concurrency concepts you need to know for the exam (
and to be a better software developer!). You should know how to create and define the thread’s work using a Runnable
instance, as well as how to pause and interrupt the thread. When working with the Concurrency API, you should also know
how to create threads using Callable lambda expressions.

At this point, you should know how to concurrently execute tasks using ExecutorService like a pro. You should also know
which ExecutorService instances are available, including scheduled and pooled services.

Thread-safety is about protecting data from being corrupted by multiple threads modifying it at the same time. Java
offers many tools to keep data safe, including atomic classes, synchronized methods/blocks, the Lock framework, and
CyclicBarrier. The Concurrency API also includes numerous collection classes that handle multithreaded access for you.
You should be familiar with the concurrent collections, including the CopyOnWrite classes, which create a new underlying
structure any time the underlying collection is modified.

When processing tasks concurrently, a variety of potential threading issues can arise. Deadlock, starvation, and
livelock can result in programs that appear stuck, while race conditions can result in unpredictable data. For the
exam, you need to know only the basic theory behind these concepts. In professional software development, however,
finding and resolving such problems is a valuable skill.

Finally, we discussed parallel streams and showed you how to use them to perform parallel decompositions and reductions.
Parallel streams can greatly improve the performance of your application.
They can also cause unexpected results since the processing is no longer ordered. Remember to avoid stateful lambda
expressions, especially when working with parallel streams.