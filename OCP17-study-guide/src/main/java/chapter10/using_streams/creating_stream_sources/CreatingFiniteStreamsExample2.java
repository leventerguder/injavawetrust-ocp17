package chapter10.using_streams.creating_stream_sources;

import java.util.stream.Stream;

public class CreatingFiniteStreamsExample2 {

    public static void main(String[] args) {


        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1, // seed
                n -> n < 100, // Predicate to specify when done
                n -> n + 2); // UnaryOperator to get next value

        oddNumberUnder100.forEach(System.out::println);
    }
}
