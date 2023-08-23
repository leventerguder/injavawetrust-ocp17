package chapter09.using_the_map_interface;

import java.util.Map;

public class MapOfExample {

    public static void main(String[] args) {

        Map<String, String> map1 = Map.of("key1", "value1", "key2", "value2");
        Map<String, Integer> map2 = Map.of("key1", 10, "key2", 20);
        //  Map<String, Integer> map3 = Map.of("key1", 10, "key2"); // DOES NOT COMPILE
        // HashMap<String, Integer> map4 = Map.of("key1", 10, "key2", 20); // DOES NOT COMPILE

        System.out.println(map1.getClass());
        System.out.println(map1);
        System.out.println(map2);

        // map1.put("immutable", "UnsupportedOperationException"); // UnsupportedOperationException
        // map1.remove("key1"); // UnsupportedOperationException
        // map1.remove("not-a-valid-key");  // UnsupportedOperationException
        // map1.replace("not-a-valid-key", "new-value"); // UnsupportedOperationException
    }
}
