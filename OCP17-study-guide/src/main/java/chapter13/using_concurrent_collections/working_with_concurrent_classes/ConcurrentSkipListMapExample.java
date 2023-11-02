package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {

    public static void main(String[] args) {

        Map<Integer,String> map  = new ConcurrentSkipListMap<>();

        map.put(10, "value1");
        map.put(100, "value2");
        map.put(80, "value3");
        map.put(60, "value4");
        map.put(40, "value5");

        System.out.println(map);
    }
}
