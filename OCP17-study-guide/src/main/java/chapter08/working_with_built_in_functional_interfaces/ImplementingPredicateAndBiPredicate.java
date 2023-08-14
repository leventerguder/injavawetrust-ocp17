package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplementingPredicateAndBiPredicate {

    public static void main(String[] args) {

        predicateTest();
        predicateTest2();
        biPredicateTest();
    }

    private static void predicateTest() {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("")); // true
        System.out.println(p2.test("")); // true
    }

    private static void predicateTest2() {

        Predicate<Integer> p1 = number -> number > 100;
        Predicate<Integer> p2 = (Integer number) -> {
            return number > 100;
        };

        System.out.println(p1.test(20));
        System.out.println(p1.test(120));

        System.out.println(p2.test(20));
        System.out.println(p2.test(120));
    }

    private static void predicateTest3() {
        Predicate<Long> p1 = PredicateHelper::checkSize;
        System.out.println(p1.test(20L));
    }

    private static void biPredicateTest() {
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick")); // true
        System.out.println(b2.test("chicken", "chick")); // true
    }
}

class PredicateHelper {
    static boolean checkSize(long size) {
        return size > 10;
    }
}