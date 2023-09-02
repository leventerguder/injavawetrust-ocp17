package chapter10.using_streams.creating_stream_sources;

import java.util.stream.Stream;

public class CreatingInfiniteStreamsExample {

    public static void main(String[] args) {

        Stream<Double> randoms = Stream.generate(Math::random);

        randoms.forEach(System.out::println); //infinite

    }
}
