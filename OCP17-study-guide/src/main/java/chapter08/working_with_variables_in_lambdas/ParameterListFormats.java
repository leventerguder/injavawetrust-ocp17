package chapter08.working_with_variables_in_lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ParameterListFormats {

    public static void main(String[] args) {

        // BinaryOperator<String> binaryOperator = (var x, y) -> "Hello"; // DOES NOT COMPILE
        BinaryOperator<String> binaryOperator2 = (var x, var y) -> "Hello";

        // BiFunction<Integer, Integer, Boolean> biFunction1 = (var x, Integer y) -> true; // DOES NOT COMPILE
        BiFunction<Integer, Integer, Boolean> biFunction2 = (var x, var y) -> true;
        BiFunction<Integer, Integer, Boolean> biFunction3 = (Integer x, Integer y) -> true;
        BiFunction<Integer, Integer, Boolean> biFunction4 = (x, y) -> true;

        // MyInterface1 lambda1 = (String x, var y, Integer z) -> true; // DOES NOT COMPILE
        MyInterface1 lambda2 = (String x, String y, Integer z) -> true;
        MyInterface1 lambda3 = (var x, var y, var z) -> true;
        MyInterface1 lambda4 = (x, y, z) -> true;

        // BiFunction<Integer, Integer, String> biFunction4 = (Integer x, y) -> "goodbye"; // DOES NOT COMPILE
        BiFunction<Integer, Integer, String> biFunction5 = (Integer x, Integer y) -> "goodbye";
        BiFunction<Integer, Integer, String> biFunction6 = (x, y) -> "goodbye";
    }
}

interface MyInterface1 {

    boolean method(String str1, String str2, Integer num);
}