package chapter13.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableExample2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var service = Executors.newSingleThreadExecutor();
        Future<Integer> result = null;
        try {
            result = service.submit(
                    () ->
                    {
                        Thread.sleep(2000); // Simulate TimeoutException
                        return 10;
                    }
            );

            System.out.println(result.get(1, TimeUnit.SECONDS));

            service.shutdown();
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println(result.isDone());
            System.out.println(result.isCancelled());
        } finally {
            service.shutdown();
        }
    }
}
