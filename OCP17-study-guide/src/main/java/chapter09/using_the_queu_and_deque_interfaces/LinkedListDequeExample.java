package chapter09.using_the_queu_and_deque_interfaces;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();

        System.out.println(deque.offerFirst(10)); //true
        System.out.println(deque.offerLast(4));  // true
        System.out.println(deque);                  // [10, 4]
        System.out.println(deque.peekFirst());      // 10
        System.out.println(deque.pollFirst());      // 10
        System.out.println(deque.pollLast());       // 4
        System.out.println(deque.pollFirst());      // null
        System.out.println(deque.pollFirst());      // null
        System.out.println(deque.removeLast());      // NoSuchElementException
    }
}
