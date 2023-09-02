package chapter10.using_streams;

import java.util.stream.Stream;

public class StreamDistinctExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print); // duckgoose
    }
}
