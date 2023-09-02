package chapter10.using_streams.using_common_terminal_operations;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectingExample {

    public static void main(String[] args) {

        collectingMethod1();

        collectingMethod2();

        collectingMethod3();

        collectingMethod4();
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

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);

        System.out.println(set); // [f, l, o, w]
    }

    private static void collectingMethod3() {

        System.out.println("### collectingMethod3 ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set =
                stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); // [f, l, o, w]
    }

    private static void collectingMethod4() {

        System.out.println("### collectingMethod4 ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]
    }


}
