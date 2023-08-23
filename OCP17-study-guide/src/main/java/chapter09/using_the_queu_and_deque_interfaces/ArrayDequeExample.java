package chapter09.using_the_queu_and_deque_interfaces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeExample {

    public static void main(String[] args) {

        Deque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addFirst(2);
        arrayDeque.add(3);
        arrayDeque.add(4);
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(0);
        arrayDeque.addLast(5);
        arrayDeque.add(6);

        System.out.println(arrayDeque); // [0, 1, 2, 3, 4, 5, 6]

        System.out.println("peekFirst");
        System.out.println(arrayDeque.peekFirst());  // 0
        System.out.println(arrayDeque.peekFirst());  // 0
        System.out.println(arrayDeque.peekFirst());  // 0

        System.out.println("peekLast");
        System.out.println(arrayDeque.peekLast());  // 6
        System.out.println(arrayDeque.peekLast());  // 6
        System.out.println(arrayDeque.peekLast());  // 6

        System.out.println("peek");
        System.out.println(arrayDeque.peek());      // 0
        System.out.println(arrayDeque.peek());      // 0
        System.out.println(arrayDeque.peek());      // 0

        System.out.println("getFirst");
        System.out.println(arrayDeque.getFirst());      // 0
        System.out.println(arrayDeque.getFirst());      // 0
        System.out.println(arrayDeque.getFirst());      // 0

        System.out.println("getLast");
        System.out.println(arrayDeque.getLast());      // 6
        System.out.println(arrayDeque.getLast());      // 6
        System.out.println(arrayDeque.getLast());      // 6

        System.out.println("removeFirst");
        System.out.println(arrayDeque.removeFirst());      // 0
        System.out.println(arrayDeque.removeFirst());      // 1
        System.out.println(arrayDeque); // [2, 3, 4, 5, 6]

        System.out.println("removeLast");
        System.out.println(arrayDeque.removeLast());      // 6
        System.out.println(arrayDeque.removeLast());      // 5
        System.out.println(arrayDeque); // [2, 3, 4]

        System.out.println("pollFirst");
        System.out.println(arrayDeque.pollFirst());      // 2
        System.out.println(arrayDeque); // [3, 4]

        System.out.println("pollLast");
        System.out.println(arrayDeque.pollLast());      // 4
        System.out.println(arrayDeque); // [3]

        System.out.println("poll");
        System.out.println(arrayDeque.poll()); // 3
        System.out.println(arrayDeque); // []
        System.out.println(arrayDeque.poll()); // null
        System.out.println(arrayDeque.poll()); // null

        System.out.println(arrayDeque.pollFirst()); // null
        System.out.println(arrayDeque.pollLast()); // null

        // System.out.println(arrayDeque.remove()); // NoSuchElementException
        // System.out.println(arrayDeque.removeFirst()); // NoSuchElementException
        // System.out.println(arrayDeque.removeLast()); // NoSuchElementException


    }
}
