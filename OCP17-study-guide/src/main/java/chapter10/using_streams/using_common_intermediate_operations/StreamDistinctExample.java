package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamDistinctExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::println);

        Stream<Integer> s2 = Stream.of(10, 50, 40, 10, 100, 40);
        s2.distinct().forEach(System.out::println);
    }
}
