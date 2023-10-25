package chapter13.creating_threads_with_the_concurrency_api.waiting_for_results;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {

    public static void main(String[] args) throws InterruptedException {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try {

            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");

        } finally {
            service.shutdown();
        }
        boolean awaitTerminationResult = service.awaitTermination(1, TimeUnit.SECONDS);
        // Check whether all tasks are finished

        // ExecutorService.awaitTermination() should only be called after an ExecutorService.shutdown() request.

        if (awaitTerminationResult)
            System.out.println("Finished!");
        else
            System.out.println("At least one task is still running");

        // Blocks until all tasks have completed execution after a shutdown request,
        // or the timeout occurs, or the current thread is interrupted, whichever happens first.
    }
}
