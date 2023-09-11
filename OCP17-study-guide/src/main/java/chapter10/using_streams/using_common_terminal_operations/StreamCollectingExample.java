package chapter10.using_streams.using_common_terminal_operations;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectingExample {

    public static void main(String[] args) {

        collectingMethod1();

        collectingMethod2();

        collectingMethod3();

        collectingMethod4();

        collectingMethod5();

        collectingMethod6();

    }

    private static void collectingMethod1() {
        System.out.println("### collectingMethod1 ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);

        System.out.println(word); // wolf
    }

    private static void collectingMethod2() {
        System.out.println("### collectingMethod2 ###");

        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        BiConsumer<StringBuilder, String> accumulator = (StringBuilder sb, String str) -> sb.append(str);
        BiConsumer<StringBuilder, StringBuilder> combiner = (StringBuilder sb, StringBuilder sb2) -> sb.append(sb2);

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(supplier,
                accumulator,
                combiner);

        System.out.println(word); // wolf
    }

    private static void collectingMethod3() {
        System.out.println("### collectingMethod3 ###");

        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        BiConsumer<StringBuilder, String> accumulator = (StringBuilder sb, String str) -> sb.append(str);
        BiConsumer<StringBuilder, StringBuilder> combiner = (StringBuilder sb, StringBuilder sb2) -> System.out.println("not triggered!");

        // sequential stream - nothing to combine

        Stream<String> stream = List.of("w", "o", "l", "f").stream();
        StringBuilder word = stream.collect(supplier,
                accumulator,
                combiner);

        System.out.println(word); // wolf
    }

    private static void collectingMethod4() {
        System.out.println("### collectingMethod4 ###");

        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        BiConsumer<StringBuilder, String> accumulator = (StringBuilder sb, String str) -> sb.append(str);
        BiConsumer<StringBuilder, StringBuilder> combiner = (StringBuilder sb, StringBuilder sb2) ->
        {
            System.out.println("triggered!");
            sb.append(sb2);
        };

        // parallel stream - combiner is combining partial results

        Stream<String> stream = List.of("w", "o", "l", "f").parallelStream();
        StringBuilder word = stream.collect(supplier,
                accumulator,
                combiner);

        System.out.println(word); // wolf
    }


    private static void collectingMethod5() {
        System.out.println("### collectingMethod5 ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.collect(String::new,
                String::concat,
                String::concat);

        System.out.println(word); // empty
    }

    private static void collectingMethod6() {
        System.out.println("### collectingMethod6 ###");

        Supplier<String> supplier = () -> new String();
        BiConsumer<String, String> accumulator = (String str1, String str2) -> str1 = str1 + str2;
        BiConsumer<String, String> combiner = (String str1, String str2) -> str1 = str1 + str2;

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.collect(supplier, accumulator, combiner);

        System.out.println(word); // empty
    }

}
