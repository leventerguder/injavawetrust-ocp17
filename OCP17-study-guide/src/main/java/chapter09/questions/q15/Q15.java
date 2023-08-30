package chapter09.questions.q15;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q15 {

    public static void main(String[] args) {

        listExample();

        queueExample();

        varExample();
    }

    private static void listExample() {
        List<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }

    private static void queueExample() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }

    private static void varExample() {
        var q = new LinkedList<>();
        q.add(10);
        q.add(12);
        q.remove(1);
        System.out.println(q);
    }
}
