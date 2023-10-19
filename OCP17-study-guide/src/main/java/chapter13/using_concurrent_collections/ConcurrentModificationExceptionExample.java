package chapter13.using_concurrent_collections;

import java.util.HashMap;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {

        var foodData = new HashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for (String key : foodData.keySet())
            foodData.remove(key); // java.util.ConcurrentModificationException
    }
}
