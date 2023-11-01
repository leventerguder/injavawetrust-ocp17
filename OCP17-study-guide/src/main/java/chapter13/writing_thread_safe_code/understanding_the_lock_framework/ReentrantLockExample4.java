package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample4 {

    public static void main(String[] args) throws InterruptedException {


        ExecutorService service = Executors.newFixedThreadPool(10);

        Lock lock = new ReentrantLock(true); // fairness

        for (int i = 0; i < 100; i++) {
            service.submit(() -> printHello(lock));
        }

        service.shutdown();
        boolean result = service.awaitTermination(5, TimeUnit.SECONDS);

        if (result)
            System.out.println("All tasks finished!");
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello! Thread#name" + Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
    }
}
