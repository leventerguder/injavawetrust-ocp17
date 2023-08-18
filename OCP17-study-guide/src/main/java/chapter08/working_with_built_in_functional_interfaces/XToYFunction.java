package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class XToYFunction {

    public static void main(String[] args) {

        doubleToIntFunctionExample();
        doubleToLongFunctionExample();
        intToDoubleFunctionExample();
        intToLongFunctionExample();
        longToDoubleFunctionExample();
        longToIntFunctionExample();

    }


    private static void doubleToIntFunctionExample() {

        System.out.println("### doubleToIntFunctionExample ###");
        DoubleToIntFunction dtif1 = (double d1) -> (int) d1;
        DoubleToIntFunction dtif2 = Helper::ceil;

        System.out.println(dtif1.applyAsInt(10.5));
        System.out.println(dtif2.applyAsInt(10.5));

        var d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
    }

    private static void doubleToLongFunctionExample() {

        System.out.println("### doubleToLongFunctionExample ###");
        DoubleToLongFunction dtlf1 = (double d1) -> (long) d1;
        DoubleToLongFunction dtlf2 = Helper::ceil;

        System.out.println(dtlf1.applyAsLong(10.5));
        System.out.println(dtlf2.applyAsLong(10.5));
    }

    private static void intToDoubleFunctionExample() {

        System.out.println("### doubleToLongFunctionExample ###");
        IntToDoubleFunction itdf1 = (int i) -> i;
        IntToDoubleFunction itdf2 = (int i) -> Math.sqrt(i);
        IntToDoubleFunction itdf3 = Math::sqrt;

        System.out.println(itdf1.applyAsDouble(15));
        System.out.println(itdf2.applyAsDouble(15));
        System.out.println(itdf3.applyAsDouble(15));
    }


    private static void intToLongFunctionExample() {

        System.out.println("### intToLongFunctionExample ###");
        IntToLongFunction itlf1 = (int i) -> i;
        IntToLongFunction itlf2 = (int i) -> i * 10L;
        IntToLongFunction itlf3 = (int i) -> Long.valueOf(i);
        IntToLongFunction itlf4 = Long::valueOf;

        System.out.println(itlf1.applyAsLong(15));
        System.out.println(itlf2.applyAsLong(15));
        System.out.println(itlf3.applyAsLong(15));
        System.out.println(itlf4.applyAsLong(15));
    }


    private static void longToDoubleFunctionExample() {

        System.out.println("### longToDoubleFunctionExample ###");
        LongToDoubleFunction ltdf1 = (long x) -> x;
        LongToDoubleFunction ltdf2 = (var x) -> x * 2.0;
        LongToDoubleFunction ltdf3 = Double::valueOf;
        LongToDoubleFunction ltdf4 = Math::sqrt;


        System.out.println(ltdf1.applyAsDouble(10));
        System.out.println(ltdf2.applyAsDouble(15));
        System.out.println(ltdf3.applyAsDouble(20));
        System.out.println(ltdf4.applyAsDouble(25));
    }

    private static void longToIntFunctionExample() {

        System.out.println("### longToIntFunctionExample ###");

        LongToIntFunction ltif1 = (var x) -> (int) x;
        LongToIntFunction ltif2 = (long i) -> Math.toIntExact(i);
        LongToIntFunction ltif3 = Math::toIntExact;

        System.out.println(ltif1.applyAsInt(100L));
        System.out.println(ltif2.applyAsInt(100L));
        System.out.println(ltif3.applyAsInt(100L));
    }

}

class Helper {

    static int ceil(double d) {
        return (int) Math.ceil(d);
    }
}

