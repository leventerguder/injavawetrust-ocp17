package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.DoubleToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ToXyzFunctionInterfaces {

    public static void main(String[] args) {

        toDoubleFunctionExample();
        toIntFunctionExample();
        toLongFunctionExample();

    }

    private static void toDoubleFunctionExample() {

        System.out.println("### toDoubleFunctionExample ###");

        ToDoubleFunction<Integer> tdf1 = (Integer i) -> i * 2.5;
        ToDoubleFunction<String> tdf2 = (String s) -> Double.parseDouble(s);
        ToDoubleFunction<String> tdf3 = Double::parseDouble;

        System.out.println(tdf1.applyAsDouble(10));
        System.out.println(tdf2.applyAsDouble("10.25"));
        System.out.println(tdf3.applyAsDouble("10.35"));
    }

    private static void toIntFunctionExample() {

        System.out.println("### toIntFunctionExample ###");

        ToIntFunction<Double> tif1 = (Double d) -> d.intValue();
        ToIntFunction<String> tif2 = (String s) -> Integer.parseInt(s);
        ToIntFunction<String> tif3 = Integer::parseInt;

        System.out.println(tif1.applyAsInt(10.0));
        System.out.println(tif2.applyAsInt("10"));
        System.out.println(tif3.applyAsInt("10"));

        var d = 1.0;
        ToIntFunction f1 = x -> 1;
        f1.applyAsInt(d);
    }

    private static void toLongFunctionExample() {

        System.out.println("### toLongFunctionExample ###");

        ToLongFunction<Long> tlf1 = (Long i) -> i * 5;
        ToLongFunction<String> tlf2 = (String s) -> Long.parseLong(s);
        ToLongFunction<String> tlf3 = Long::parseLong;


        System.out.println(tlf1.applyAsLong(10L));
        System.out.println(tlf2.applyAsLong("10"));
        System.out.println(tlf3.applyAsLong("10"));
    }

}

