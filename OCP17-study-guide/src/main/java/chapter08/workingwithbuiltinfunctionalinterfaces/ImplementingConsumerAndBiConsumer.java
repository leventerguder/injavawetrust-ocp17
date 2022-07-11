package chapter08.workingwithbuiltinfunctionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ImplementingConsumerAndBiConsumer {

    public static void main(String[] args) {

        consumerTest();
        biConsumerTest();
        biConsumerTest2();
    }

    private static void consumerTest() {

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");
        c2.accept("Annie");

    }

    private static void biConsumerTest() {

        var map = new HashMap<String, Integer>();

        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);
    }

    private static void biConsumerTest2() {

        var map = new HashMap<String, String>();

        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", "Cluck");
        b2.accept("chick", "Tweep");

        System.out.println(map);
    }
}
