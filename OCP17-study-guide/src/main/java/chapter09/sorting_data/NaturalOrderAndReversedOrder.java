package chapter09.sorting_data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NaturalOrderAndReversedOrder {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(100);
        numbers.add(70);
        numbers.add(50);
        numbers.add(40);
        numbers.add(60);
        numbers.add(0);
        numbers.add(-10);

        System.out.println(numbers);

        Collections.sort(numbers, Comparator.naturalOrder());

        System.out.println(numbers);

        Collections.sort(numbers, Comparator.reverseOrder());

        System.out.println(numbers);
    }
}
