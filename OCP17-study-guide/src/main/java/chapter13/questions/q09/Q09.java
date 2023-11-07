package chapter13.questions.q09;

public class Q09 {

//    Which happens when a new task is submitted to an ExecutorService in which no threads are available?
//    A. The executor throws an exception when the task is submitted.
//    B. The executor discards the task without completing it.
//+++    C. The executor adds the task to an internal queue and completes when there is an available thread.
//    D. The thread submitting the task waits on the submit call until a thread is available before continuing.
//    E. The executor stops an existing task and starts the newly submitted one.

    /*
    If a task is submitted to a thread executor, and the thread executor does not have any
    available threads, the call to the task will return immediately with the task being queued
    internally by the thread executor
    */
}
