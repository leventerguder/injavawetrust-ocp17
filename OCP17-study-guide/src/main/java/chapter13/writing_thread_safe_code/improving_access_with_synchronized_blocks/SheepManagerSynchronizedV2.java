package chapter13.writing_thread_safe_code.improving_access_with_synchronized_blocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerSynchronizedV2 {
    private int sheepCount = 0;

    private final Object herd = new Object();
    private void incrementAndReport() {
        synchronized (herd) {
            System.out.print((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerSynchronizedV2 manager = new SheepManagerSynchronizedV2();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}
