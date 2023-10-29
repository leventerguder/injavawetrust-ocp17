package chapter13.writing_thread_safe_code.understanding_thread_safety;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class IncrementAndDecrementTaskExample {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(20);

        IncrementAndDecrementTask task = new IncrementAndDecrementTask();

        for (int i = 0; i < 1_000; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        boolean finished = executorService.awaitTermination(5, TimeUnit.SECONDS);

        if(finished)
            System.out.println(task.getCounter());

    }
}
