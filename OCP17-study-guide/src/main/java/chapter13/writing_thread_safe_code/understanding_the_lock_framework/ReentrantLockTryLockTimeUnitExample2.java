package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTryLockTimeUnitExample2 {

    public static void main(String[] args) throws InterruptedException {

        Lock lock = new ReentrantLock();
        new Thread(() -> printHello(lock)).start();


        Thread.sleep(500);

        if(lock.tryLock(1, TimeUnit.SECONDS)) {
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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
