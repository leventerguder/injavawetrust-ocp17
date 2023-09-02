package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length)
                .forEach(System.out::println); // 676
    }
}
