package chapter13.writing_thread_safe_code.improving_access_with_synchronized_blocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SheepManagerBadSynchronized {
    private int sheepCount = 0;

    private void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerBadSynchronized manager = new SheepManagerBadSynchronized();
            for (int i = 0; i < 10; i++)
                synchronized (manager) {
                    service.submit(() -> manager.incrementAndReport());
                }
        } finally {
            service.shutdown();
        }
    }
}
