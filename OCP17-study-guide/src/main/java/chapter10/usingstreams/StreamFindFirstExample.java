package chapter10.usingstreams;

import java.util.stream.Stream;

public class StreamFindFirstExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findFirst().ifPresent(System.out::println); // monkey
        infinite.findFirst().ifPresent(System.out::println); // chimp
    }
}
