package chapter09.sorting_data;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6, 9, 1, 8);
        Collections.sort(list); // [1, 6, 8, 9]
        System.out.println(Collections.binarySearch(list, 6)); // 1
        System.out.println(Collections.binarySearch(list, 3)); // -2

// The number 3 would need to be inserted at index 1 (after the number 1 but before the number 6). Negating that gives us
//−1, and subtracting 1 gives us −2.
    }
}
