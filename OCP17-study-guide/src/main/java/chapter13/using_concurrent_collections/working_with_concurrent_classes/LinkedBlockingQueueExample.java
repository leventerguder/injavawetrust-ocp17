package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueExample {

    public static void main(String[] args) {

        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();
            blockingQueue.offer(91);
            blockingQueue.offer(5, 2, TimeUnit.MINUTES);
            blockingQueue.offer(47, 100, TimeUnit.MICROSECONDS);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingQueue.poll(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingQueue.poll(1, TimeUnit.SECONDS));
        } catch (InterruptedException e) { // Handle interruption
        }
    }
}
