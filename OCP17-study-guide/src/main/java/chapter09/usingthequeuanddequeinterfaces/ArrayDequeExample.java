package chapter09.usingthequeuanddequeinterfaces;

import java.util.ArrayDeque;
import java.util.Deque;

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
