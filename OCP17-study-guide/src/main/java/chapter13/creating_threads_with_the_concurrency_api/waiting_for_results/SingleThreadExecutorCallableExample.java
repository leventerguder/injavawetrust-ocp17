package chapter13.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingleThreadExecutorCallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get()); // 41
            service.shutdown();
        } finally {
            service.shutdown();
        }
    }
}
