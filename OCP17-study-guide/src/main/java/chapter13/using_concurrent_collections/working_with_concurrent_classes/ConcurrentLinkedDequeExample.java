package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        deque.push(20);

        System.out.println(deque); // [20, 10]
        System.out.println(deque.peek()); // 20
        System.out.println(deque.pop());  // 20
        System.out.println(deque.pop());  // 10
    }
}
