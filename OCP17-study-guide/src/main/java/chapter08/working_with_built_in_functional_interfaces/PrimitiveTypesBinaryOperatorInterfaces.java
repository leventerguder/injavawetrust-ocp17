package chapter08.working_with_built_in_functional_interfaces;

import java.util.Random;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class PrimitiveTypesBinaryOperatorInterfaces {

    public static void main(String[] args) {

        doubleBinaryOperatorExample();
        intBinaryOperatorExample();
        longBinaryOperatorExample();

    }

    private static void doubleBinaryOperatorExample() {
        System.out.println("### doubleBinaryOperatorExample ###");
        DoubleBinaryOperator dbo1 = Math::pow;
        DoubleBinaryOperator dbo2 = Math::max;
        DoubleBinaryOperator dbo3 = (double d1, double d2) -> d1 * d2;
        DoubleBinaryOperator dbo4 = PrimitiveBinaryOperatorHelper::multiply;

        System.out.println(dbo1.applyAsDouble(2.0, 3.0));
        System.out.println(dbo2.applyAsDouble(2.0, 3.0));
        System.out.println(dbo3.applyAsDouble(2.0, 3.0));
        System.out.println(dbo4.applyAsDouble(2.0, 3.0));
    }

    private static void intBinaryOperatorExample() {
        System.out.println("### intBinaryOperatorExample ###");
        IntBinaryOperator ibo1 = Integer::min;
        IntBinaryOperator ibo2 = Integer::max;
        IntBinaryOperator ibo3 = (int i, int j) -> i * j;
        IntBinaryOperator ibo4 = PrimitiveBinaryOperatorHelper::multiply;

        System.out.println(ibo1.applyAsInt(2, 3));
        System.out.println(ibo2.applyAsInt(2, 3));
        System.out.println(ibo3.applyAsInt(2, 3));
        System.out.println(ibo4.applyAsInt(2, 3));
    }

    private static void longBinaryOperatorExample() {
        System.out.println("### longBinaryOperatorExample ###");
        LongBinaryOperator lbo1 = Long::min;
        LongBinaryOperator lbo2 = Long::max;
        LongBinaryOperator lbo3 = (long i, long j) -> i * j;
        LongBinaryOperator lbo4 = PrimitiveBinaryOperatorHelper::multiply;

        System.out.println(lbo1.applyAsLong(2, 3));
        System.out.println(lbo2.applyAsLong(2, 3));
        System.out.println(lbo3.applyAsLong(2, 3));
        System.out.println(lbo4.applyAsLong(2, 3));
    }
}

class PrimitiveBinaryOperatorHelper {

    static double multiply(double d1, double d2) {
        return d1 * d2;
    }

    static int multiply(int i, int j) {
        return i * j;
    }

    static long multiply(long i, long j) {
        return i * j;
    }
}
