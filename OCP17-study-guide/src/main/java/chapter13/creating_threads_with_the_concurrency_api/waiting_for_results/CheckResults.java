package chapter13.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.*;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] unused) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 1_000_000; i++) counter++;
            }
            );
            Object resultReference = result.get(10, TimeUnit.SECONDS); // Returns null for Runnable
            System.out.println("Reached!");
            System.out.println(resultReference);
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
    }
}