package chapter10.using_streams.using_common_terminal_operations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinMaxExample {

    public static void main(String[] args) {

        streamMin();
        streamMax();
        emptyStream();

        streamMinAndMax();

    }

    private static void streamMin() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo", "horse", "hypothalamus");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println); // ape
    }

    private static void streamMax() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo", "horse", "hypothalamus");
        Optional<String> max = s.max((s1, s2) -> s1.length() - s2.length());
        max.ifPresent(System.out::println); // hypothalamus
    }

    // Since the stream is empty, the comparator is never called, and no value is present in the Optional.
    private static void emptyStream() {
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty);
        System.out.println(minEmpty.isPresent()); // false
    }

    private static void streamMinAndMax() {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo", "horse", "hypothalamus");
        Optional<String> min = s.min(Comparator.comparingInt(String::length));

        // IllegalStateException: stream has already been operated upon or closed
        Optional<String> max = s.max(Comparator.comparingInt(String::length));


    }
}
