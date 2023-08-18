package chapter08.working_with_built_in_functional_interfaces;

import java.util.Random;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class PrimitiveTypesFunctionInterfaces {

    public static void main(String[] args) {

        doubleFunctionExample();
        intFunctionExample();
        longFunctionExample();
    }

    private static void doubleFunctionExample() {
        System.out.println("### doubleFunctionExample ### ");
        DoubleFunction<String> df1 = Double::toHexString;
        DoubleFunction<String> df2 = (d) -> Double.toHexString(d);
        DoubleFunction<Double> df3 = Double::valueOf;
        DoubleFunction<Double> df4 = Math::sqrt;
        DoubleFunction<String> df5 = PrimitiveFunctionHelper::convertFromDouble;

        DoubleFunction<Double> df6 = new Random()::nextDouble;

        System.out.println(df1.apply(10.5));
        System.out.println(df2.apply(10.5));
        System.out.println(df3.apply(10.5));
        System.out.println(df4.apply(10.5));
        System.out.println(df5.apply(10.5));
        System.out.println(df6.apply(10.5));

    }

    private static void intFunctionExample() {

        System.out.println("### intFunctionExample ### ");
        IntFunction<String> if1 = Double::toHexString;
        IntFunction<String> if2 = Integer::toHexString;

        IntFunction<String> if3 = (d) -> Double.toHexString(d);
        IntFunction<String> if4 = (d) -> Integer.toHexString(d);

        IntFunction<Double> if5 = Double::valueOf;
        IntFunction<Integer> if6 = Integer::valueOf;

        IntFunction<Double> if7 = Math::sqrt;
        IntFunction<String> if8 = PrimitiveFunctionHelper::convertFromDouble;
        IntFunction<String> if9 = PrimitiveFunctionHelper::convertFromInt;

        IntFunction<Integer> if10 = new Random()::nextInt;

        System.out.println(if1.apply(10));
        System.out.println(if2.apply(10));
        System.out.println(if3.apply(10));
        System.out.println(if4.apply(10));
        System.out.println(if5.apply(10));
        System.out.println(if6.apply(10));
        System.out.println(if7.apply(10));
        System.out.println(if8.apply(10));
        System.out.println(if9.apply(10));
        System.out.println(if10.apply(10));

    }


    private static void longFunctionExample() {
        System.out.println("### longFunctionExample ### ");
        LongFunction<String> lf1 = Double::toHexString;
        LongFunction<String> lf2 = Long::toHexString;

        LongFunction<String> lf3 = (d) -> Double.toHexString(d);
        LongFunction<String> lf4 = (d) -> Long.toHexString(d);

        LongFunction<Double> lf5 = Double::valueOf;
        LongFunction<Long> lf6 = Long::valueOf;

        LongFunction<Double> lf7 = Math::sqrt;
        LongFunction<String> lf8 = PrimitiveFunctionHelper::convertFromDouble;
        LongFunction<String> lf9 = PrimitiveFunctionHelper::convertFromLong;

        LongFunction<Long> lf10 = new Random()::nextLong;

        System.out.println(lf1.apply(10));
        System.out.println(lf2.apply(10));
        System.out.println(lf3.apply(10));
        System.out.println(lf4.apply(10));
        System.out.println(lf5.apply(10));
        System.out.println(lf6.apply(10));
        System.out.println(lf7.apply(10));
        System.out.println(lf8.apply(10));
        System.out.println(lf9.apply(10));
        System.out.println(lf10.apply(10));

    }

}

class PrimitiveFunctionHelper {
    static String convertFromDouble(double value) {
        return "converted value : " + value;
    }

    static String convertFromInt(int value) {
        return "converted value : " + value;
    }

    static String convertFromLong(long value) {
        return "converted value : " + value;
    }
}