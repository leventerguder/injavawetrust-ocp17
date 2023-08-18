package chapter08.working_with_built_in_functional_interfaces;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplementingFunctionAndBiFunction {

    public static void main(String[] args) {

        functionExample();
        functionExample2();
        functionExample3();
        functionHelperExample();
        biFunctionExample();
        biFunctionHelperExample();
    }

    private static void functionExample() {

        System.out.println("### functionExample ###");
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        Function<String, String> f3 = String::toUpperCase;
        Function<String, String> f4 = s -> s.toUpperCase();

        System.out.println(f1.apply("cluck"));
        System.out.println(f2.apply("cluck"));
        System.out.println(f3.apply("hello"));
        System.out.println(f4.apply("hello"));
    }

    private static void functionExample2() {

        System.out.println("### functionExample2 ###");
        String str = "content";
        Function<String, Integer> f1 = str::indexOf;
        System.out.println(f1.apply("o"));
    }

    private static void functionExample3() {

        System.out.println("### functionExample3 ###");
        Function<List<Integer>, Integer> f1 = List::size;
        Function<List<Integer>, Integer> f2 = (list) -> list.size();

        System.out.println(f1.apply(List.of(1, 2, 3)));
        System.out.println(f2.apply(List.of(1, 2, 3)));
    }

    private static void functionHelperExample() {

        System.out.println("### functionHelperExample ###");
        Function<String, Integer> f1 = FunctionHelper::length;
        Function<String, Integer> f2 = s -> FunctionHelper.length(s);
        Function<FunctionHelper, Integer> f3 = FunctionHelper::multiply;

        System.out.println(f1.apply("hello world!"));
        System.out.println(f2.apply("hello world"));
        System.out.println(f3.apply(new FunctionHelper(10)));
    }

    private static void biFunctionExample() {

        System.out.println("### biFunctionExample ###");
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }

    private static void biFunctionHelperExample() {

        System.out.println("### biFunctionHelperExample ###");
        BiFunction<String, String, String> bf1 = BiFunctionHelper::concat;
        BiFunction<String, String, Integer> bf2 = BiFunctionHelper::length;

        BiFunction<BiFunctionHelper, String, Integer> bf3 = BiFunctionHelper::compareTo;
        BiFunction<BiFunctionHelper, String, Integer> bf4 = BiFunctionHelper::compareToV2;

        System.out.println(bf1.apply("hello", "world"));
        System.out.println(bf2.apply("hello", "world"));
        System.out.println(bf3.apply(new BiFunctionHelper("hello-world"), "sample"));
        System.out.println(bf4.apply(new BiFunctionHelper("hello-world"), "sample"));
    }

}

class FunctionHelper {

    private int size;

    public FunctionHelper(int size) {
        this.size = size;
    }

    static Integer length(String s) {
        return s.length();
    }

    Integer multiply() {
        return size * 5;
    }
}

class BiFunctionHelper {

    private String content;

    public BiFunctionHelper(String content) {
        this.content = content;
    }

    static String concat(String str, String str2) {
        return "Prefix -".concat(str).concat(str2).concat(" - suffix");
    }

    static Integer length(String str, String str2) {
        return str.concat(str2).length();
    }

    Integer compareTo(String str) {
        return content.compareTo(str);
    }

    static Integer compareToV2(BiFunctionHelper bfh, String str) {
        return 10;
    }
}
