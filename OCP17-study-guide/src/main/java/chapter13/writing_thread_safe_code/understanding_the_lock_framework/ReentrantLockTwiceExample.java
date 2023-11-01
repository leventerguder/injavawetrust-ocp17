package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTwiceExample {

    public static void main(String[] args) throws InterruptedException {

        performTask();

        new Thread(ReentrantLockTwiceExample::performTask).start();
        new Thread(ReentrantLockTwiceExample::performTask).start();
        new Thread(ReentrantLockTwiceExample::performTask).start();
        new Thread(ReentrantLockTwiceExample::performTask).start();
    }

    static Lock lock = new ReentrantLock();

    private static void performTask() {

        if (lock.tryLock()) {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Lock can not obtained!");
        }

    }
}
