package chapter09.using_the_map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("key1", "value1");
        hashMap.put("key1", "value1-new-value");

        System.out.println(hashMap.put("key2", "value2")); // null
        System.out.println(hashMap.put("key2", "value2-new-value")); // value2

        System.out.println(hashMap);

        hashMap.put(null, "value3");

        System.out.println(hashMap);

        hashMap.put("key4", null);
        hashMap.put("key5", null);
        hashMap.put(null, null);

        System.out.println(hashMap);
    }
}
