package chapter09.using_the_queu_and_deque_interfaces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class ArrayDequeExample {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        stack.peek(); //4
        stack.poll(); //4
        stack.poll(); //10
        stack.poll(); // null
    }
}
