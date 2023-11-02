package chapter13.using_concurrent_collections.understanding_memory_consistency_errors;

import java.util.concurrent.ConcurrentHashMap;

public class AvoidConcurrentModificationExceptionExample {
    public static void main(String[] args) {

        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key);
    }
}
