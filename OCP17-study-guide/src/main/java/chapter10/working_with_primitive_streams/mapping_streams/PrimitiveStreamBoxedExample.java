package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamBoxedExample {

    public static void main(String[] args) {

        Random random = new Random();
        IntStream intStream = random.ints(5);
        IntStream intStream2 = random.ints(5);


        Stream<Integer> stream = mapping(intStream);
        stream.forEach(e -> System.out.print(e + " "));

        System.out.println();
        Stream<Integer> stream2 = boxing(intStream2);
        stream2.forEach(e -> System.out.print(e + " "));


    }

    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }

    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
}
