package chapter09.using_the_queu_and_deque_interfaces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println(stack); // [50, 40, 30, 20, 10]

        System.out.println(stack.peek()); // 10
        System.out.println(stack.peek()); // 10
        System.out.println(stack.pop());  // 10
        System.out.println(stack.pop());  // 20
        System.out.println(stack.pop());  // 30
        System.out.println(stack.pop());  // 40
        System.out.println(stack.pop());  // 50
    }
}