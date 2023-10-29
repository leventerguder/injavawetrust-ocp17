package chapter13.writing_thread_safe_code.understanding_thread_safety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CounterExample {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        Counter counter = new Counter();

        for (int i = 0; i < 1_000; i++) {
            executorService.submit(counter::execute);
        }

        executorService.shutdown();
        boolean finished = executorService.awaitTermination(5, TimeUnit.SECONDS);

        if (finished)
            System.out.println(counter.getValue());

        // https://docs.oracle.com/javase/tutorial/essential/concurrency/interfere.html

//        c++ can be decomposed into three steps:
//
//        Retrieve the current value of c.
//        Increment the retrieved value by 1.
//        Store the incremented value back in c.

//        Suppose Thread A invokes increment at about the same time Thread B invokes decrement.
//        If the initial value of c is 0, their interleaved actions might follow this sequence:
//
//        Thread A: Retrieve c.
//        Thread B: Retrieve c.
//        Thread A: Increment retrieved value; result is 1.
//        Thread B: Decrement retrieved value; result is -1.
//        Thread A: Store result in c; c is now 1.
//        Thread B: Store result in c; c is now -1.

//        Thread A's result is lost, overwritten by Thread B
    }
}
