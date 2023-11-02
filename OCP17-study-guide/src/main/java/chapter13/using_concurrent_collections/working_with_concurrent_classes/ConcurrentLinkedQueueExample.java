package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(10);
        queue.offer(20);

        System.out.println(queue);
        System.out.println(queue.peek()); // 10
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 20
    }
}
