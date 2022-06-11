package chapter04;

import java.util.Arrays;

public class ArraysComparing {


    public static void main(String[] args) {

        System.out.println(Arrays.compare(new int[]{1}, new int[]{2})); // negative
        System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{2})); // positive
        System.out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 2})); // zero

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"})); // negative
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"})); // positive
        //Uppercase is smaller than lowercase
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{"Z"})); // positive

        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null})); // positive
        // null is smaller than a letter.

        // System.out.println(Arrays.compare(new int[]{1}, new String[]{"a"})); // DOES NOT COMPILE
    }
}
