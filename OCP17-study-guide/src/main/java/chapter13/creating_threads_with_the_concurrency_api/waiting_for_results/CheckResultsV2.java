package chapter13.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CheckResultsV2 {
    private static int counter = 0;

    public static void main(String[] unused) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<Integer> result = service.submit(() -> {
                        for (int i = 0; i < 1_000_000; i++) {
                            counter++;
                        }
                        return counter;
                    }
            );
            Integer counterResult = result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!  " + counterResult);
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
    }
}