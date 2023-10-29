package chapter13.writing_thread_safe_code.protecting_data_with_atomic_classes;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArrayExample {

    public static void main(String[] args) {

        int[] ints = {1, 4, 6, 3, 7, 8, 10, 3};

        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(ints);

        System.out.println(atomicIntegerArray.get(2));

        atomicIntegerArray.set(3, 100);

        System.out.println(atomicIntegerArray.decrementAndGet(3));

        System.out.println(Arrays.toString(ints));
    }
}
