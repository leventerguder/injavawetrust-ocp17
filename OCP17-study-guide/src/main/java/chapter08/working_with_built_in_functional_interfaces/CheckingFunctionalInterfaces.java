package chapter08.working_with_built_in_functional_interfaces;

import java.util.List;
import java.util.function.*;

public class CheckingFunctionalInterfaces {

    public static void main(String[] args) {

        // Returns a String without taking any parameters

        Supplier<String> supplier = () -> "content";

        // Returns a Boolean and takes a String

        Function<String, Boolean> function = str -> str.isEmpty();

        // Returns an Integer and takes two Integers

        BinaryOperator<Integer> binaryOperator = (i, j) -> i * j;

        BiFunction<Integer, Integer, Integer> biFunction = (i, j) -> i * j;


        Predicate<List> ex1 = x -> "".equals(x.get(0));

        Consumer<Long> ex2 = (Long l) -> System.out.println(l);

        BiPredicate<String, String> ex3 = (s1, s2) -> false;

        // Function<List<String>> ex4 = x -> x.get(0); // DOES NOT COMPILE

        // UnaryOperator<Long> ex5 = (Long l) -> 3.14; // DOES NOT COMPILE
    }
}
