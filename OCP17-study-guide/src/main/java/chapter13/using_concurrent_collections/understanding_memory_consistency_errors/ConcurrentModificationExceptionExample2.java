package chapter13.using_concurrent_collections.understanding_memory_consistency_errors;

import java.util.HashMap;

public class ConcurrentModificationExceptionExample2 {
    public static void main(String[] args) {

        var foodData = new HashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet()) {
            foodData.put(key + "ConcurrentModificationException", 3);
        }
    }
}
