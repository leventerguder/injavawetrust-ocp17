package chapter13.using_concurrent_collections.obtaining_syncronized_collections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SynchronizedNavigableSetExample {

    public static void main(String[] args) {

        NavigableSet<Integer> times = new TreeSet<>();
        times.add(1205);
        times.add(1505);
        times.add(1545);
        times.add(1830);
        times.add(2010);
        times.add(2100);

        System.out.println("last before 4pm is: " + times.lower(1600));
        System.out.println("first after 8pm is: " + times.higher(2000));

        // the NavigableSet methods related to this type of navigation are
        // lower(), floor(), higher(), ceiling(),
        // and the mostly parallel NavigableMap methods are
        // lowerKey(), floorKey(), ceilingKey(), and higherKey().

        // The difference between lower() and floor() is that lower()
        // returns the element less than the given element, and floor()
        // returns the element less than or equal to the given element.

        // Similarly, higher() returns the element greater than the given element,
        // and ceiling() returns the element greater than or equal to the given element.

        NavigableSet<Integer> navigableSet = Collections.synchronizedNavigableSet(times);
        System.out.println(navigableSet.ceiling(2010));
        System.out.println(navigableSet.higher(2010));
    }
}
