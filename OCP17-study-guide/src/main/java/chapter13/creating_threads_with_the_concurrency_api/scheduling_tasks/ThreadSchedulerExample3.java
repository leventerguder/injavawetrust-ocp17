package chapter13.creating_threads_with_the_concurrency_api.scheduling_tasks;

import java.time.LocalTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadSchedulerExample3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Callable<String> task1 = () ->
        {
            LocalTime now = LocalTime.now();
            System.out.println("Task time : " + now);
            return "Hello Message!";
        };

        LocalTime now = LocalTime.now();
        System.out.println("Before schedule : " + now);
        ScheduledFuture<String> r1 = service.schedule(task1, 5, TimeUnit.SECONDS);

        System.out.println(r1.get());

        service.shutdown();

    }
}
