package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamMapToLongExample {

    public static void main(String[] args) {

        Stream<String> objStream = Stream.of("penguin", "fish");
        LongStream intStream = objStream.mapToLong(String::length);

        intStream.forEach(System.out::println);
    }
}
