package chapter09.comparing_collection_types;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // Vector is no longer on the exam.
        // public synchronized boolean add(E e)

        Vector<String> vector = new Vector<>();
        vector.add("value1");
        vector.add("value2");
        vector.add("value3");

        for (String e : vector) {
            System.out.println(e);
        }
    }
}
