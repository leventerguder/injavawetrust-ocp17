package chapter13.creating_threads_with_the_concurrency_api.scheduling_tasks;

import java.util.concurrent.*;

public class ThreadSchedulerExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";
        ScheduledFuture<?> r1 = service.schedule(task1, 2, TimeUnit.SECONDS);
        ScheduledFuture<?> r2 = service.schedule(task2, 4, TimeUnit.SECONDS);

        System.out.println(r1.get());
        System.out.println(r2.get());

    }
}
