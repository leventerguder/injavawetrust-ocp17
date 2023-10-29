package chapter13.writing_thread_safe_code.understanding_thread_safety;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CounterExample {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newCachedThreadPool();

        Counter counter = new Counter();

        for (int i = 0; i < 1_000; i++) {
            executorService.submit(() -> counter.add(10));
        }

        executorService.shutdown();
        boolean awaitTermination = executorService.awaitTermination(5, TimeUnit.SECONDS);

        if(awaitTermination) {
            System.out.println(counter.getCount());
        }
    }
}
