package chapter09.sorting_data;

import java.util.TreeSet;

public class TreeSetIntegerExample {

    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(100);
        numbers.add(70);
        numbers.add(50);
        numbers.add(40);
        numbers.add(60);
        numbers.add(0);
        numbers.add(-10);
        // numbers.add(null); // NullPointerException

        System.out.println(numbers);

    }
}
