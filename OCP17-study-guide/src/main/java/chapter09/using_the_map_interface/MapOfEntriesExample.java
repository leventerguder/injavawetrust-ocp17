package chapter09.using_the_map_interface;

import java.util.Map;

public class MapOfEntriesExample {


    public static void main(String[] args) {
        Map<String, String> map1 = Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"));

        System.out.println(map1.getClass());
        System.out.println(map1);

        // map1.put("immutable", "UnsupportedOperationException"); // UnsupportedOperationException
    }
}
