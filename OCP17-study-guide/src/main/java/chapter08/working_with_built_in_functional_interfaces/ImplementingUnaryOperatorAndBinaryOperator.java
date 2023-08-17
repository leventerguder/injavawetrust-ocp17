package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class ImplementingUnaryOperatorAndBinaryOperator {

    public static void main(String[] args) {

        unaryOperatorExample();
        unaryOperatorExample2();
        unaryOperatorHelperExample();
        binaryOperatorExample();
        binaryOperatorExample2();
        binaryOperatorHelperExample();

    }

    private static void unaryOperatorExample() {

        System.out.println("### unaryOperatorExample ###");
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp")); // CHIRP
        System.out.println(u2.apply("chirp")); // CHIRP
    }

    private static void unaryOperatorExample2() {

        System.out.println("### unaryOperatorExample2 ###");
        String str = "content ";
        UnaryOperator<String> u1 = str::concat;
        // UnaryOperator<String> u2 = String::concat; // DOES NOT COMPILE

        System.out.println(u1.apply("chirp")); // CHIRP

    }

    private static void unaryOperatorHelperExample() {

        System.out.println("### unaryOperatorHelperExample ###");
        UnaryOperator<Integer> u1 = UnaryOperatorHelper::square;

        // Bad return type in method reference: cannot convert long to java.lang.Integer
        // UnaryOperator<Integer> u2 = UnaryOperatorHelper::square2;

        UnaryOperator<Long> u3 = UnaryOperatorHelper::square2;

        System.out.println(u1.apply(25));
        System.out.println(u3.apply(10L));
    }


    private static void binaryOperatorExample() {

        System.out.println("### binaryOperatorExample ###");
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }


    private static void binaryOperatorExample2() {

        System.out.println("### binaryOperatorExample ###");
        BinaryOperator<Double> b1 = Math::pow;
        BinaryOperator<Integer> b2 = Math::max;

        System.out.println(b1.apply(2.0, 5.0));
        System.out.println(b2.apply(12, 15));
    }

    private static void binaryOperatorHelperExample() {

        System.out.println("### binaryOperatorHelperExample ###");
        BinaryOperator<Integer> b1 = BinaryOperatorHelper::multiply;
        BinaryOperator<Integer> b2 = (Integer i, Integer j) -> BinaryOperatorHelper.multiply(i, j);

        System.out.println(b1.apply(10, 6));
        System.out.println(b2.apply(10, 6));
    }
}

class UnaryOperatorHelper {

    static int square(int i) {
        return i * i;
    }

    static long square2(long i) {
        return i * i;
    }
}

class BinaryOperatorHelper {

    static int multiply(int i, int j) {
        return i * j;
    }
}