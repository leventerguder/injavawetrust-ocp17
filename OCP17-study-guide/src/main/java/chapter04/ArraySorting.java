package chapter04;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {

        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");


        System.out.println();
        System.out.println(Arrays.toString(numbers));


        System.out.println();

        String[] strings = {"10", "9", "100"};
        Arrays.sort(strings);
        for (String s : strings)
            System.out.print(s + " ");

    }
}
