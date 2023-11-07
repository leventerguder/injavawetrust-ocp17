package chapter13.questions.q12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q12 {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(4);
        try {
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
            service.execute(() -> takeNap());
        } finally {
            service.shutdown();
        }
        service.awaitTermination(2, TimeUnit.SECONDS);
        System.out.println("DONE!");

        // B It will pause for 2 seconds and then print DONE!.

        // The awaitTermination() method waits a specified amount of time for all tasks
        // to complete and the service to finish shutting down.
        // Since, each five-second task is still executing, the awaitTermination() method will return with a value of false
        // after two seconds but not throw an exception.

    }

    private static void takeNap() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
