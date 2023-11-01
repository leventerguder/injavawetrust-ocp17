package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockExample2 {

    private static final Lock LOCK = new ReentrantLock();

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(ReentrantLockTryLockExample2::tryLockMethod);
        executorService.submit(ReentrantLockTryLockExample2::tryLockMethod);

        executorService.shutdown();
    }

    private static void tryLockMethod() {

        if (LOCK.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code. Thread#name " + Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                LOCK.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else.Thread#name " + Thread.currentThread().getName());
        }
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }
}
