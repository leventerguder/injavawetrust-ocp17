package chapter13.using_concurrent_collections.working_with_concurrent_classes;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String[] args) {

        Map<String,Integer> concurrentMap =  new ConcurrentHashMap<>();
        concurrentMap.put("key1", 10);
        concurrentMap.put("key2", 20);

        System.out.println(concurrentMap);
    }
}
