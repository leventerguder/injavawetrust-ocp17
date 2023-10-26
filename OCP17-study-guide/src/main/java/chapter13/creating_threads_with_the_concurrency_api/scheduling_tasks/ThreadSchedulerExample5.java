package chapter13.creating_threads_with_the_concurrency_api.scheduling_tasks;

import java.time.LocalTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadSchedulerExample5 {

    static int counter = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () ->
        {
            LocalTime now = LocalTime.now();
            System.out.println("Task time : " + now);
            System.out.println("Counter : " + ++counter);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        LocalTime now = LocalTime.now();
        System.out.println("Before schedule : " + now);
        ScheduledFuture<?> r1 = service.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);

    }
}
