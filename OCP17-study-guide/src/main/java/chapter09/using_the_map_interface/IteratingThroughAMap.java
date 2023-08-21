package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;

public class IteratingThroughAMap {

    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.forEach((k, v) -> System.out.println(v));

        System.out.println();
        map.values().forEach(System.out::println);

        System.out.println();
        map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));


    }
}
