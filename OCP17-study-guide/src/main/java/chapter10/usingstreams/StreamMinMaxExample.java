package chapter10.usingstreams;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinMaxExample {

    public static void main(String[] args) {

        streamMin();
        streamMax();
        emptyStream();

    }

    private static void streamMin() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo", "horse", "hypothalamus");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape
    }

    private static void streamMax() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo", "horse", "hypothalamus");
        Optional<String> min = s.max((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape
    }

    // Since the stream is empty, the comparator is never called, and no value is present in the Optional.
    private static void emptyStream() {
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
    }
}
