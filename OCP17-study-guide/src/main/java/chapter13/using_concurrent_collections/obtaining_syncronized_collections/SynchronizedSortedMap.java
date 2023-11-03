package chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class SynchronizedSortedMap {

    public static void main(String[] args) {

        TreeMap<String, String> original = new TreeMap<>();
        original.put("sample", "value1");
        original.put("dummy", "value2");
        original.put("valid", "value3");

        SortedMap<String, String> sortedMap = Collections.synchronizedSortedMap(original);

        System.out.println(sortedMap);
    }
}
