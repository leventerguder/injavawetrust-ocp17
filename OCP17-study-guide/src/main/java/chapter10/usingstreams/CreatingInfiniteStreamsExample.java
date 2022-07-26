package chapter10.usingstreams;

import java.util.stream.Stream;

public class CreatingInfiniteStreamsExample {

    public static void main(String[] args) {

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);


    }
}
