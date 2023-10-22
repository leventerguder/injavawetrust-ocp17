package chapter13.creating_threads_with_the_concurrency_api.introducing_the_single_thread_executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {

    public static void main(String[] args) {

        Runnable printInventory = () ->
                System.out.println("Printing zoo inventory , Thread :  " + Thread.currentThread().getName());

        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i + "  , Thread : " + Thread.currentThread().getName());
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

        System.out.println("Thread : " + Thread.currentThread().getName());

    }
}
