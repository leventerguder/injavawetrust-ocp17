package chapter09.using_the_queu_and_deque_interfaces;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);

        System.out.println(queue.remove()); // 10
        System.out.println(queue.peek()); //4
        System.out.println(queue.peek()); //4


        Queue<Integer> queue2 = new PriorityQueue<>();
        queue2.add(10);
        queue2.add(4);

        System.out.println(queue2.remove()); // 10
        System.out.println(queue2.peek()); //4
        System.out.println(queue2.peek()); //4
    }
}
