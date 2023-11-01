package chapter13.writing_thread_safe_code.understanding_the_lock_framework;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class ZooEmployeeNameManager {
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private List<String> names = new ArrayList<>();

    public ZooEmployeeNameManager() {
        names.add("John Smith");
        names.add("Sarah Smith");
        names.add("James Johnson");
    }

    private String readNames(int i) {
        Lock lock = readWriteLock.readLock();
        try {
            lock.lock();
            System.out.println("Read Lock Obtained!");
            return names.get(i % names.size());
        } finally {
            System.out.println("Read Lock Released!");
            lock.unlock();
        }
    }

    private void addName(String name) {
        Lock lock = readWriteLock.writeLock();
        try {
            lock.lock();
            System.out.println("Write Lock Obtained!");
            Thread.sleep(1000);
            names.add(name);
        } catch (InterruptedException e) {
// Handle thread interrupted exception
        } finally {
            System.out.println("Write Lock Released!");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ZooEmployeeNameManager manager = new ZooEmployeeNameManager();
        ExecutorService service = null;
        try {

            service = Executors.newFixedThreadPool(20);

            service.submit(() -> manager.addName("Grace Hopper"));
            service.submit(() -> manager.addName("Josephine Davis"));

            for (int i = 0; i < 100; i++) {
                final int employeeNumber = i;
                service.submit(() -> manager.readNames(employeeNumber));
            }

        } finally {
            if (service != null) service.shutdown();
        }
    }
}