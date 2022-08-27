package chapter13.creatingthreadswiththeconcurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorAwaitTermination {

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
        service.awaitTermination(1, TimeUnit.SECONDS);
        // Check whether all tasks are finished

        if (service.isTerminated())
            System.out.println("Finished!");
        else
            System.out.println("At least one task is still running");
    }
}
