package chapter10.usingstreams;

import java.util.stream.Stream;

public class StreamFilteringExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::print); // monkey
    }
}
