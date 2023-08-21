package chapter09.comparing_collection_types;

import java.util.Hashtable;

public class HashtableExample {

    public static void main(String[] args) {

        // Hashtable is no longer on the exam.
        // public synchronized V put(K key, V value) {
        Hashtable<String, String> map = new Hashtable<>();

        map.put("key1", "value1");
        // map.put("key2", null); // java.lang.NullPointerException

        map.put(null, "value2"); // java.lang.NullPointerException

        // Hashtable does not allow null key or value.
    }
}
