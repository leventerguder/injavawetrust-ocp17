package chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListExample3 {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> original = new ArrayList<>();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        List<Integer> synchronizedList = Collections.synchronizedList(original);


        for (Integer i : synchronizedList) {
            if (i == 2) {
                synchronizedList.remove(Integer.valueOf(2));
                // java.util.ConcurrentModificationException
            }
        }

    }
}
