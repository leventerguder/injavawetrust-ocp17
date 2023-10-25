package chapter13.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureCancelExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callableMessage = () -> {
            Thread.sleep(1000);
            return "Callable Message!";
        };

        Future<String> stringFuture = executorService.submit(callableMessage);
        int count = 0;
        while (!stringFuture.isDone()) {
            System.out.println("Task is still not done...");
            Thread.sleep(200);
            count++;
            if (count > 3) {  // if (count > 4) {
                System.out.println("Cancelling....");
                stringFuture.cancel(true);
            }
        }

        if (!stringFuture.isCancelled()) {
            System.out.println("Task completed! Retrieving the result");
            String result = stringFuture.get();
            System.out.println(result);
        } else {
            System.out.println("Task was cancelled");
        }

        executorService.shutdown();
    }
}
