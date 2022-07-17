package chapter09.usingthequeuanddequeinterfaces;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(4);

        System.out.println(queue.remove()); // 10
        System.out.println(queue.peek()); //4
        System.out.println(queue.peek()); //4
    }
}
