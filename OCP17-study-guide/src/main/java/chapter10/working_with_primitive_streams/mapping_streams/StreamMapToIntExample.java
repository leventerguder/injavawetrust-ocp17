package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMapToIntExample {

    public static void main(String[] args) {

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());

        intStream.forEach(System.out::println);
    }
}
