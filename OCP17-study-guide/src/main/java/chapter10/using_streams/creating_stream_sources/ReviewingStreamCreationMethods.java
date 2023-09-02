package chapter10.using_streams.creating_stream_sources;

import java.util.List;
import java.util.stream.Stream;

public class ReviewingStreamCreationMethods {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.empty();

        Stream<Integer> s2 = Stream.of(10, 20, 30, 40);

        List<Integer> list = List.of(10, 20, 30);
        Stream<Integer> s3 = list.stream();
        Stream<Integer> s4 = list.parallelStream();

        Stream<String> s5 = Stream.generate(() -> "Infinite Message!");

        Stream<Integer> s6 = Stream.iterate(0, x -> x + 10);

        Stream<Integer> s7 = Stream.iterate(0, p -> p < 100, x -> x + 10);
    }
}
