package chapter04;

import java.util.Arrays;

public class ArrayMismatch {

    public static void main(String[] args) {

        //If the arrays are equal, mismatch() returns -1. Otherwise, it returns the first index where they differ.
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));  // -1
        System.out.println(Arrays.mismatch(new String[]{"a"}, new String[]{"A"})); //0
        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1})); //1
    }
}
