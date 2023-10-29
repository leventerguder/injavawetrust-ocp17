package chapter13.writing_thread_safe_code.protecting_data_with_atomic_classes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManagerAtomic {
    private AtomicInteger sheepCount = new AtomicInteger(0);

    private void incrementAndReport() {
        System.out.print((sheepCount.incrementAndGet()) + " ");
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerAtomic manager = new SheepManagerAtomic();
            for (int i = 0; i < 10; i++)
                service.submit(() -> manager.incrementAndReport());
        } finally {
            service.shutdown();
        }
    }
}
