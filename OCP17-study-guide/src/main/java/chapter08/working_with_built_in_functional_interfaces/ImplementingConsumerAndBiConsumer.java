package chapter08.working_with_built_in_functional_interfaces;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ImplementingConsumerAndBiConsumer {

    public static void main(String[] args) {

        consumerExample();
        consumerHelperExample();
        biConsumerExample1();
        biConsumerHelperExample();
        biConsumerExample2();
        biConsumerExample3();


    }

    private static void consumerExample() {

        System.out.println("### consumerExample ###");
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        PrintStream ps = System.out;
        Consumer<String> c3 = ps::println;


        Consumer<StringBuilder> c4 = System.out::println;
        Consumer<List> c5 = System.out::println;

        c1.accept("Annie");
        c2.accept("Annie");
        c3.accept("Annie");
        c4.accept(new StringBuilder("Annie"));
        c5.accept(List.of("Annie"));

    }

    private static void consumerHelperExample() {

        System.out.println("### consumerHelperExample ###");
        Consumer<String> c1 = ConsumerHelper::method;
        Consumer<Integer> c2 = ConsumerHelper::method;
        Consumer<Integer> c3 = ConsumerHelper::methodWithReturn;

        Consumer<String> c4 = s -> ConsumerHelper.method(s);
        // Consumer<String> c5 = s -> "value"; // DOES NOT COMPILE

        Consumer<String> c6 = s -> {
            System.out.println(s);
            System.out.println(s.length());
        };

        Consumer<StringBuilder> c7 = ConsumerHelper::method;
        Consumer<List<String>> c8 = ConsumerHelper::method;

        c1.accept("hello world!");
        c2.accept(10);
        c3.accept(20);
        c4.accept("hello world!");
        c6.accept("hello world!");
        c7.accept(new StringBuilder("hello world!"));
        c8.accept(List.of("v1", "v2", "v3"));
    }

    private static void biConsumerExample1() {

        System.out.println("### biConsumerExample1 ###");
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);
    }

    private static void biConsumerHelperExample() {

        System.out.println("### biConsumerHelperExample ###");
        BiConsumer<Integer, Integer> bc1 = BiConsumerHelper::method;
        BiConsumer<String, Integer> bc2 = BiConsumerHelper::method;

        bc1.accept(5, 10);
        bc2.accept("10", 20);
    }

    private static void biConsumerExample2() {

        System.out.println("### biConsumerExample2 ###");
        BiConsumer<String, String> bc1 = String::concat;
        BiConsumer<String, String> bc2 = (str1, str2) -> str1.concat(str2);
        BiConsumer<String, String> bc3 = (str1, str2) ->
        {
            System.out.println(str1.concat(str2));
        };

        BiConsumer<BiConsumerHelper, String> bc4 = BiConsumerHelper::instanceMethod;


        bc1.accept("hello", "world");
        bc2.accept("hello", "world");
        bc3.accept("hello", "world");
        bc4.accept(new BiConsumerHelper(), "message!");
    }

    private static void biConsumerExample3() {

        System.out.println("### biConsumerExample3 ###");
        var map = new HashMap<String, String>();
        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", "Cluck");
        b2.accept("chick", "Tweep");

        System.out.println(map);
    }
}

class ConsumerHelper {

    static void method(String str) {
        System.out.println(str);
    }

    static void method(Integer i) {
        System.out.println(i);
    }

    static int methodWithReturn(Integer i) {
        System.out.println(i * 2);
        return i * 2;
    }

    static void method(StringBuilder sb) {
        System.out.println(sb);
    }

    static void method(List<String> list) {
        System.out.println(list);
    }
}

class BiConsumerHelper {

    static void method(Integer i, Integer j) {
        System.out.println(i + j);
    }

    static void method(String str, Integer j) {
        System.out.println(Integer.parseInt(str) * j);
    }

    void instanceMethod(String str) {
        System.out.println(str);
    }

}