package chapter04.understanding_arrays;

import java.util.Arrays;

public class SearchingArray {

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5
        System.out.println(Arrays.binarySearch(numbers, 30)); // -5


        int[] numbersNotSorted = new int[]{3, 2, 1};

        System.out.println(Arrays.binarySearch(numbersNotSorted, 2));
        System.out.println(Arrays.binarySearch(numbersNotSorted, 3));

        // The array isn’t sorted. This means the output will not be defined.
    }
}
