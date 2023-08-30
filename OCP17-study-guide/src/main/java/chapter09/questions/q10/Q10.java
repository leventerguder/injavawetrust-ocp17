package chapter09.questions.q10;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q10 {

    public static void main(String[] args) {

        var list = List.of(1, 2, 3);
        var set = Set.of(1, 2, 3);
        var map = Map.of(1, 2, 3, 4);

        list.forEach(System.out::println);

        set.forEach(System.out::println);

        // map.forEach(System.out::println); // DOES NOT COMPILE

        // map.keys().forEach(System.out::println); // DOES NOT COMPILE

        map.keySet().forEach(System.out::println);

        map.values().forEach(System.out::println);

        // map.valueSet().forEach(System.out::println); // DOES NOT COMPILE
    }
}
