package chapter08.questions.q08;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Q08 {

    public static void main(String[] args) {

        UnaryOperator<Integer> u = x -> x * x;

        // BiFunction<T, U, R>
        // BinaryOperator<T>
        // Function<T, R>

        // BiFunction<Integer> f = x -> x * x; // DOES NOT COMPILE
        // BiFunction<Integer, Integer> f = x -> x * x; // DOES NOT COMPILE
        // BinaryOperator<Integer, Integer> f = x -> x * x; // DOES NOT COMPILE
        // Function<Integer> f = x -> x * x; // DOES NOT COMPILE
        Function<Integer, Integer> f = x -> x * x;
    }
}
