package chapter04.understanding_arrays;

import java.util.Arrays;

public class UsingMethodsWithVarargs {
    public static void main(String... args) {
        System.out.println("main");

        varArgs(1, 10, 200, 0, 4, 62, 23, 4356);

    }

    private static void varArgs(int... numbers) {
        System.out.println(Arrays.toString(numbers));
    }// varargs
}
