package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Comparator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSortedExample {

    public static void main(String[] args) {

        streamSortedExample();

        streamReverseOrderExample();

        // streamReverseOrderDoesNotCompile();
    }

    private static void streamSortedExample() {
        System.out.println("### streamSortedExample ###");
        Stream<String> s = Stream.of("dog-", "cat-", "brown-", "bear-", "bird-");
        s.sorted().forEach(System.out::print); // bear-bird-brown-cat-dog-
        System.out.println();
    }

    private static void streamReverseOrderExample() {
        System.out.println("### streamReverseOrderExample ###");
        Stream<String> s = Stream.of("dog-", "cat-", "brown-", "bear-", "bird-");
        s.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear-
        System.out.println();
    }

    private static void streamReverseOrderDoesNotCompile() {
//        Stream<String> s = Stream.of("brown bear-", "grizzly-");
//        s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
//
//        Comparator<String> comparator = Comparator::reverseOrder; // DOES NOT COMPILE
//        Supplier<Comparator> supplier = Comparator::reverseOrder;
//
//         reverseOrder() takes
//         no arguments and returns a value, the method reference is equivalent to
//         () -> Comparator.reverseOrder(), which is really a Supplier<Comparator>.
    }
}
