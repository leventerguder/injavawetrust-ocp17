package chapter09.using_the_map_interface;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

    public static void main(String[] args) {

        Map<String, Integer> hashtable = new Hashtable<>();

        hashtable.put("key1", 10);

        // hashtable.put("key2", null); // NullPointerException

        // hashtable.put(null, 20); // // NullPointerException

        //    public synchronized V put(K key, V value)

    }
}
