package chapter09.using_the_set_interface;

import java.util.Set;

public class SetOfExample {

    public static void main(String[] args) {

        Set<Integer> numbers = Set.of(1, 5, 10, 20);

        System.out.println(numbers);

        Set<Integer> duplicateNotAllowed = Set.of(10, 10);
        // java.lang.IllegalArgumentException: duplicate element: 10
    }
}
