package chapter09.working_with_generics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CreatingUnboundWildcardsExample4 {
    public static void printList(List<?> list) {
        for (Object x : list) {
            System.out.println(x);
            // list.add(100);
            // list.add("DOES NOT COMPILE");
            list.add(null);
        }
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        printList(keywords);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        printList(numbers);

    }

}
