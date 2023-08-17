package chapter08.working_with_built_in_functional_interfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ImplementingPredicateAndBiPredicate {

    public static void main(String[] args) {

        predicateExample1();
        predicateExample2();
        predicateExample3();
        predicateHelperExample();
        biPredicateExample();
        biPredicateHelperExample();
    }

    private static void predicateExample1() {

        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        Predicate<String> p3 = (String str) -> str.length() > 5;


        System.out.println(p1.test("")); // true
        System.out.println(p2.test("")); // true
        System.out.println(p3.test("Hello Predicate!"));
    }

    private static void predicateExample2() {

        Predicate<Integer> p1 = number -> number > 100;
        Predicate<Integer> p2 = (Integer number) -> {
            return number > 100;
        };


        System.out.println(p1.test(20));
        System.out.println(p1.test(120));

        System.out.println(p2.test(20));
        System.out.println(p2.test(120));
    }

    private static void predicateExample3() {

        Predicate<List<Integer>> p1 = (List<Integer> list) -> list.contains(100);

        Predicate<List<Integer>> p2 = List::isEmpty;
        //Predicate<List<Integer>> p3 = ArrayList::isEmpty; // DOES NOT COMPILE
        p1.test(List.of(10, 20, 50, 100));
        p2.test(List.of(1, 2, 3));
    }

    private static void predicateHelperExample() {
        Predicate<Long> p1 = PredicateHelper::checkSize;
        Predicate<Integer> p2 = PredicateHelper::checkSize;

        Predicate<PredicateHelper> p3 = PredicateHelper::sampleMethod;
        // Predicate<PredicateHelper> p4 = PredicateHelper::sampleStaticMethod; // DOES NOT COMPILE
        Predicate<PredicateHelper> p5 = PredicateHelper::sampleStaticMethod2; // DOES NOT COMPILE

        System.out.println(p1.test(20L));
        p2.test(10);
        p3.test(new PredicateHelper(100));
        p5.test(new PredicateHelper(10));
    }

    private static void biPredicateExample() {

        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

        BiPredicate<String, String> b3 = String::endsWith;
        BiPredicate<String, String> b4 = (string, suffix) -> string.endsWith(suffix);

        BiPredicate<String, String> b5 = String::contains;

        System.out.println(b1.test("chicken", "chick")); // true
        System.out.println(b2.test("chicken", "chick")); // true
        System.out.println(b3.test("hello", "world"));
        System.out.println(b4.test("hello", "world"));
        System.out.println(b5.test("injavawetrust", "java"));

    }

    private static void biPredicateHelperExample() {

        BiPredicate<Integer, Integer> b1 = BiPredicateHelper::check;
        BiPredicate<String, Integer> b2 = BiPredicateHelper::check2;

        System.out.println(b1.test(1, 5));
        System.out.println(b2.test("hello", 5));
    }
}

class PredicateHelper {


    private int size;

    public PredicateHelper(int size) {
        this.size = size;
    }

    static boolean checkSize(long size) {
        return size > 10;
    }

    static boolean checkSize(int size) {
        return size > 10;
    }

    boolean sampleMethod() {
        return this.size == 10;
    }

    static boolean sampleStaticMethod() {
        return false;
    }

    static boolean sampleStaticMethod2(PredicateHelper ph) {
        return ph == null;
    }
}

class BiPredicateHelper {

    static boolean check(Integer i, Integer j) {
        return i > j;
    }

    static Boolean check2(String s, Integer i) {
        return s.length() > i;
    }
}