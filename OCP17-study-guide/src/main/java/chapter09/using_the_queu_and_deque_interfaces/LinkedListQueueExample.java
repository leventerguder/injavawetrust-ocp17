package chapter09.using_the_queu_and_deque_interfaces;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

    public static void main(String[] args) {

        linkedListQueueExample();
        linkedListQueueExample2();
    }

    private static void linkedListQueueExample() {

        System.out.println("### linkedListQueueExample ###");

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);

        System.out.println(queue.remove()); // 10
        System.out.println(queue.peek()); //4
        System.out.println(queue.peek()); //4
    }

    private static void linkedListQueueExample2() {

        System.out.println("### linkedListQueueExample ###");

        Queue<Integer> queue = new LinkedList<>();

        queue.add(35);
        queue.offer(10);
        queue.offer(30);
        queue.add(25);
        queue.add(15);
        queue.add(5);

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll()); // No Exception!
        System.out.println(queue.poll()); // No Exception!
        System.out.println(queue.poll()); // No Exception!
        System.out.println(queue.poll()); // No Exception!

        System.out.println(queue.remove()); // NoSuchElementException

    }
}
