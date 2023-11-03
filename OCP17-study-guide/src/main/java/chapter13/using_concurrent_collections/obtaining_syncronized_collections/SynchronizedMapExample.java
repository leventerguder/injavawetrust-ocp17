package chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        // populate the map
        map.put("Value1", "20");
        map.put("Value2", "30");
        map.put("Value3", "40");

        System.out.println("Map : " + map);

        Map<String, String> synchronizedMap = Collections.synchronizedMap(map);

        System.out.println("Synchronized map is : " + synchronizedMap);
    }
}
