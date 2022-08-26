package chapter13.creatingthreadswiththeconcurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {

    public static void main(String[] args) {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
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

    }
}
