package chapter08.working_with_built_in_functional_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class ImplementingSupplier {

    public static void main(String[] args) {

        supplierTest1();
        supplierTest2();
        supplierTest3();
        supplierTest4();
    }

    private static void supplierTest1() {

        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);
    }

    private static void supplierTest2() {

        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();

        System.out.println(s1.get());
        System.out.println(s2.get());

    }

    private static void supplierTest3() {
        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1); // []

        System.out.println(s3);

    }

    private static void supplierTest4() {

        Supplier<Double> s1 = () -> Math.random();
        System.out.println(s1.get());
    }
}