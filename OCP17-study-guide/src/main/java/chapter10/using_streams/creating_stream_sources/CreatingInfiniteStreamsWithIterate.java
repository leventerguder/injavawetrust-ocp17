package chapter10.using_streams.creating_stream_sources;

import java.util.stream.Stream;

public class CreatingInfiniteStreamsWithIterate {

    public static void main(String[] args) {

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.forEach(System.out::println); //infinite

    }
}
