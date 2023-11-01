package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockExample {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();
        // Thread.sleep(100);
        if (lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            System.out.println("Hello");
            // Thread.sleep(200);
        } finally {
            lock.unlock();
        }
    }
}
