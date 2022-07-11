package chapter08.workingwithbuiltinfunctionalinterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplementingPredicateAndBiPredicate {

    public static void main(String[] args) {

        predicateTest();
        biPredicateTest();
    }

    private static void predicateTest() {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("")); // true
        System.out.println(p2.test("")); // true
    }

    private static void biPredicateTest() {
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick")); // true
        System.out.println(b2.test("chicken", "chick")); // true
    }
}
