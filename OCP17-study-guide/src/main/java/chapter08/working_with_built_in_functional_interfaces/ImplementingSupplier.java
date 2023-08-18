package chapter08.working_with_built_in_functional_interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class ImplementingSupplier {

    public static void main(String[] args) {

        localDateSupplierExample();
        stringBuilderSupplierExample();
        arrayListSupplierExample();
        randomSupplierExample();
        stringSupplierExample();
        supplierHelperExample();
    }

    private static void localDateSupplierExample() {

        System.out.println("### localDateSupplierExample ###");
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);
    }

    private static void stringBuilderSupplierExample() {

        System.out.println("### stringBuilderSupplierExample ###");
        Supplier<StringBuilder> s1 = StringBuilder::new;
        Supplier<StringBuilder> s2 = () -> new StringBuilder();

        System.out.println(s1.get());
        System.out.println(s2.get());

    }

    private static void arrayListSupplierExample() {

        System.out.println("### arrayListSupplierExample ###");
        Supplier<ArrayList<String>> s1 = ArrayList::new;
        Supplier<ArrayList<String>> s2 = () -> new ArrayList<>();

        ArrayList<String> a1 = s1.get();
        ArrayList<String> a2 = s2.get();
        System.out.println(a1); // []
        System.out.println(a2);

        System.out.println(s1);

    }

    private static void randomSupplierExample() {

        System.out.println("### randomSupplierExample ###");
        Supplier<Double> s1 = () -> Math.random();
        Supplier<Double> s2 = Math::random;
        Supplier<Integer> s3 = new Random()::nextInt;
        Supplier<Integer> s4 = () -> 10;

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());
        System.out.println(s4.get());
    }

    private static void stringSupplierExample() {

        System.out.println("### stringSupplierExample ###");
        Supplier<String> s1 = String::new;
        Supplier<String> s2 = () -> "value";

        // Supplier<Integer> s3 = Integer::new; // DOES NOT COMPILE
        Supplier<Integer> s4 = () -> 100;
        Supplier<Integer> s5 = () -> Integer.valueOf(100);


        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s4.get());
        System.out.println(s5.get());
    }


    private static void supplierHelperExample() {

        System.out.println("### supplierHelperExample ###");

        Supplier<Integer> s1 = SupplierHelper::method1;
        Supplier<Integer> s2 = () -> SupplierHelper.method1();
        Supplier<Integer> s3 = () -> {
            return SupplierHelper.method1();
        };
        Supplier<Integer> s4 = () -> 10;

        Supplier<Integer> s5 = SupplierHelper::method2;

        // Bad return type in method reference: cannot convert long to java.lang.Integer
        //Supplier<Integer> s6 = SupplierHelper::method3; // DOES NOT COMPILE

        // ad return type in method reference: cannot convert short to java.lang.Integer
        //Supplier<Integer> s7 = SupplierHelper::method4; // DOES NOT COMPILE

        // Supplier<Integer> s8 = SupplierHelper::instanceMethod; // DOES NOT COMPILE

        Supplier<Integer> s9 = new SupplierHelper()::instanceMethod;

        System.out.println(s1.get());
        System.out.println(s2.get());
        System.out.println(s3.get());
        System.out.println(s4.get());
        System.out.println(s5.get());
        System.out.println(s9.get());

    }

}

class SupplierHelper {

    static int method1() {
        return new Random().nextInt();
    }

    static Integer method2() {
        return new Random().nextInt();
    }

    static long method3() {
        return new Random().nextInt();
    }

    static short method4() {
        return (short) new Random().nextInt();
    }

    int instanceMethod() {
        return new Random().nextInt();
    }
}