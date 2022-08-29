package chapter13.writingthreadsafecode;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample1 {

    public static void main(String[] args) {

        // Implementation #1 with a synchronized block
        Object object = new Object();
        synchronized (object) {
            // Protected code
        }

        // Implementation #2 with a Lock
        Lock lock = new ReentrantLock();
        try {
            lock.lock();
            // Protected code
        } finally {
            lock.unlock();
        }
    }
}
