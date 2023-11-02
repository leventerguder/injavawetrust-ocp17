package chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedListExample2 {

    private static final Object LOCK = new Object();

    public static void main(String[] args) throws InterruptedException {

        List<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        List<Integer> synchronizedList = Collections.synchronizedList(original);
        List<Integer> nonSynchronizedList = new ArrayList<>(original);
        List<Integer> nonSynchronizedListWithObjectLock = new ArrayList<>(original);
        List<Integer> nonSynchronizedListWithReentrantLock = new ArrayList<>(original);

        ExecutorService executorService = Executors.newCachedThreadPool();

        ReentrantLock reentrantLock = new ReentrantLock();

        for (int i = 0; i < 1000; i++) {
            executorService.submit(() -> synchronizedList.add(new Random().nextInt()));
            executorService.submit(() -> nonSynchronizedList.add(new Random().nextInt()));

            executorService.submit(() ->
                    {
                        synchronized (LOCK) {
                            nonSynchronizedListWithObjectLock.add(new Random().nextInt());
                        }
                    }
            );

            executorService.submit(() ->
                    {
                        try {
                            reentrantLock.lock();
                            nonSynchronizedListWithReentrantLock.add(new Random().nextInt());
                        } finally {
                            reentrantLock.unlock();
                        }
                    }
            );


        }

        executorService.shutdown();

        boolean result = executorService.awaitTermination(1, TimeUnit.MINUTES);

        if (result) {
            System.out.println(synchronizedList.size());
            System.out.println(nonSynchronizedList.size());
            System.out.println(nonSynchronizedListWithObjectLock.size());
            System.out.println(nonSynchronizedListWithReentrantLock.size());

        }
    }
}
