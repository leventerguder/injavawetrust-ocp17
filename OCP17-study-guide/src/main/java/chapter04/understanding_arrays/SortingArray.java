package chapter04.understanding_arrays;

import java.util.Arrays;

public class SortingArray {

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

        System.out.println();

        String[] names = {"ahmet", "mehmet", "tarik", "hasan", "ali"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] values = {"azz", "aaa", "Aba", "ACa", "Zaz", "ZaA", "ZYa", "1zzz", "zzz"};
        Arrays.sort(values);

        System.out.println(Arrays.toString(values));

    }
}
