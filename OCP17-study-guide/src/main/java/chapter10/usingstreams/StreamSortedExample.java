package chapter10.usingstreams;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamSortedExample {

    public static void main(String[] args) {

        streamSortedExample();

        streamReverseOrderExample();

        streamReverseOrderDoesNotCompile();
    }

    private static void streamSortedExample() {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::print); // bear-brown-
    }

    private static void streamReverseOrderExample() {
        Stream<String> s = Stream.of("brown bear-", "grizzly-");
        s.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear-
    }

    private static void streamReverseOrderDoesNotCompile() {
//        Stream<String> s = Stream.of("brown bear-", "grizzly-");
//        s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE

        // reverseOrder() takes
        // no arguments and returns a value, the method reference is equivalent to
        // () -> Comparator.reverseOrder(), which is really a Supplier<Comparator>.
    }
}
