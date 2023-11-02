package chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSetExample {
    public static void main(String[] args) {

        Set<String> keys = new HashSet<>();

        keys.add("key1");
        keys.add("key2");
        keys.add("key3");

        Set<String> synchronizedSet = Collections.synchronizedSet(keys);

        System.out.println(synchronizedSet);
    }

}
