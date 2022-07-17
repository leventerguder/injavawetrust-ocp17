package chapter09.usingthequeuanddequeinterfaces;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);   //true
        deque.offerLast(4);     //true
        deque.peekFirst();          //10
        deque.pollFirst();          //10
        deque.pollLast();           //4
        deque.pollFirst();          //null
        deque.peekFirst();          //null
    }
}
