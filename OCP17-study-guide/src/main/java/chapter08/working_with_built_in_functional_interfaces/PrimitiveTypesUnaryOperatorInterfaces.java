package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class PrimitiveTypesUnaryOperatorInterfaces {

    public static void main(String[] args) {

        doubleUnaryOperatorExample();
        intUnaryOperatorExample();
        longUnaryOperatorExample();

    }

    private static void doubleUnaryOperatorExample() {

        System.out.println("### doubleUnaryOperatorExample ###");
        DoubleUnaryOperator duo1 = Double::valueOf;
        DoubleUnaryOperator duo2 = Math::sqrt;
        DoubleUnaryOperator duo3 = Math::sin;
        DoubleUnaryOperator duo4 = (double d) -> d * 2;
        // Incompatible parameter types in lambda expression: expected double but found Double
        // DoubleUnaryOperator duo5 = (Double d) -> d * 2;
        DoubleUnaryOperator duo6 = PrimitiveUnaryOperatorHelper::multiply;


        System.out.println(duo1.applyAsDouble(5.2));
        System.out.println(duo2.applyAsDouble(5.2));
        System.out.println(duo3.applyAsDouble(5.2));
        System.out.println(duo4.applyAsDouble(5.2));
        System.out.println(duo6.applyAsDouble(5.2));
    }

    private static void intUnaryOperatorExample() {

        System.out.println("### intUnaryOperatorExample ###");
        IntUnaryOperator iuo1 = Integer::valueOf;
        IntUnaryOperator iuo2 = (i) -> i * 5;
        IntUnaryOperator iuo3 = Math::toIntExact;
        IntUnaryOperator iuo4 = PrimitiveUnaryOperatorHelper::sum;

        // Bad return type in method reference: cannot convert double to int
        // IntUnaryOperator iuo5 = PrimitiveUnaryOperatorHelper::multiply; // DOES NOT COMPILE

        System.out.println(iuo1.applyAsInt(10));
        System.out.println(iuo2.applyAsInt(10));
        System.out.println(iuo3.applyAsInt(10));
        System.out.println(iuo4.applyAsInt(10));

    }

    private static void longUnaryOperatorExample() {

        System.out.println("### longUnaryOperatorExample ###");

        LongUnaryOperator luo1 = Long::valueOf;
        LongUnaryOperator luo2 = (i) -> i * 5;
        LongUnaryOperator luo3 = Math::toIntExact;
        LongUnaryOperator luo4 = PrimitiveUnaryOperatorHelper::substract;

        System.out.println(luo1.applyAsLong(10));
        System.out.println(luo2.applyAsLong(10));
        System.out.println(luo3.applyAsLong(10));
        System.out.println(luo4.applyAsLong(10));
    }

}

class PrimitiveUnaryOperatorHelper {
    static double multiply(double value) {
        return value * 2;
    }

    static int sum(int num) {
        return num + 100;
    }

    static long substract(long num) {
        return num - 100;
    }

}