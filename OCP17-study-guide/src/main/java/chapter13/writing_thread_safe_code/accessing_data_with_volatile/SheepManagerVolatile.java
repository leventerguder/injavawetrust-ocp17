package chapter13.writing_thread_safe_code.accessing_data_with_volatile;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerVolatile {
    private int  sheepCount = 0;

    private void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerVolatile manager = new SheepManagerVolatile();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}
