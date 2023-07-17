package chapter04.questions.q15;

import java.util.Arrays;

public class Q15 {

    public static void main(String[] args) {

        var arr = new String[]{"PIG", "pig", "123"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [123, PIG, pig]
        System.out.println(Arrays.binarySearch(arr, "Pippa")); //-3


    }
}
