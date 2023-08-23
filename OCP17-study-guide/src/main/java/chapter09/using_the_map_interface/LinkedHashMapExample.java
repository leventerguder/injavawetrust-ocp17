package chapter09.using_the_map_interface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("key1", 10);
        linkedHashMap.put("key2", 20);
        linkedHashMap.put("key3", 30);
        linkedHashMap.put("key4", 40);
        linkedHashMap.put("key5", 50);
        linkedHashMap.put("key6", 60);
        linkedHashMap.put("key7", 70);
        linkedHashMap.put("key8", 80);
        linkedHashMap.put("key9", 90);
        linkedHashMap.put("key10", 100);

        linkedHashMap.put(null, -1);
        linkedHashMap.put("invalid", null);

        System.out.println(linkedHashMap);
    }
}
