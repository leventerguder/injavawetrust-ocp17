package chapter05.overloading_methods;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Parrot {

    public static void print(List<Integer> i) {
        System.out.print("I");
    }

    public static void print(CharSequence c) {
        System.out.print("C");
    }

    public static void print(Object o) {
        System.out.print("O");
    }

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2019, Month.JULY, 4));
    }
}
