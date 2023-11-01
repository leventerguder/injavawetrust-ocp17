package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTwiceExample2 {

    public static void main(String[] args) throws InterruptedException {

        performTask();

        new Thread(ReentrantLockTwiceExample2::performTask).start();
        new Thread(ReentrantLockTwiceExample2::performTask).start();
        new Thread(ReentrantLockTwiceExample2::performTask).start();
        new Thread(ReentrantLockTwiceExample2::performTask).start();
    }

    static Lock lock = new ReentrantLock();

    private static void performTask() {

        if (lock.tryLock()) {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
                lock.unlock(); // It is critical that you release a lock the same number of times it is acquired!
            }
        } else {
            System.out.println("Lock can not obtained!");
        }

    }
}
