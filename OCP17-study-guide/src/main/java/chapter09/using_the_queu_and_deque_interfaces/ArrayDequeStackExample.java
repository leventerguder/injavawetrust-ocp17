package chapter09.using_the_queu_and_deque_interfaces;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeStackExample {

    public static void main(String[] args) {

        arrayDequeStackExample1();

        arrayDequeStackExample2();

    }

    private static void arrayDequeStackExample1() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack.peek()); //4
        System.out.println(stack.poll()); //4
        System.out.println(stack.poll()); //10
        System.out.println(stack.peek()); // null
    }

    private static void arrayDequeStackExample2() {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println(stack);

        System.out.println(stack.peek()); // 10
        System.out.println(stack.peek()); // 10
        System.out.println(stack.pop());  // 10
        System.out.println(stack.pop());  // 20
        System.out.println(stack.pop());  // 30
        System.out.println(stack.pop());  // 40
        System.out.println(stack.pop());  // 50
        // System.out.println(stack.pop());  // NoSuchElementException

//        public void push(E e) {
//            addFirst(e);
//        }

//        public E pop() {
//            return removeFirst();
//        }
    }
}
