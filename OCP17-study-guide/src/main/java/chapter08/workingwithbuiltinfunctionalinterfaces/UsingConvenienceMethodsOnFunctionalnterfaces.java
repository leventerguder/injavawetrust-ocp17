package chapter08.workingwithbuiltinfunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class UsingConvenienceMethodsOnFunctionalnterfaces {

    public static void main(String[] args) {
        predicateV1Test();
        predicateV2Test();
        consumerTest();
        functionTest();
    }

    private static void predicateV1Test() {

        String eggType1 = "brown egg";
        String eggType2 = "white egg";

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        System.out.println(brownEggs.test(eggType1));
        System.out.println(otherEggs.test(eggType2));

        // This works, but it’s not great. It’s a bit long to read, and it contains duplication.
    }

    private static void predicateV2Test() {

        String eggType1 = "brown egg";
        String eggType2 = "white egg";

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test(eggType1));
        System.out.println(otherEggs.test(eggType2));
    }

    private static void consumerTest() {

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie"); // 1: Annie,2: Annie
    }

    private static void functionTest() {

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined = after.compose(before);
        System.out.println(combined.apply(3)); // 8

    }
}
