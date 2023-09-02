package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamBoxedExample {

    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
}
