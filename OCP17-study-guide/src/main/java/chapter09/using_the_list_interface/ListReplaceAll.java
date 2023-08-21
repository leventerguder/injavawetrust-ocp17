package chapter09.using_the_list_interface;

import java.util.Arrays;

public class ListReplaceAll {

    public static void main(String[] args) {

        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers); // [2, 4, 6]
    }
}
