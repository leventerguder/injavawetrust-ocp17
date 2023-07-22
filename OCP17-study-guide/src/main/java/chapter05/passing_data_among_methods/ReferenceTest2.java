package chapter05.passing_data_among_methods;

import java.util.ArrayList;
import java.util.List;

public class ReferenceTest2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        method(numbers);
        System.out.println(numbers);
    }

    private static void method(List<Integer> list) {
        list.add(40);
        list.add(50);
        list = null;
    }
}
