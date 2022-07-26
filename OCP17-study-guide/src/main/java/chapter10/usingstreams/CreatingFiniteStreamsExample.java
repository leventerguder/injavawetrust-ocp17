package chapter10.usingstreams;

import java.util.stream.Stream;

public class CreatingFiniteStreamsExample {

    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();          // count = 0
        Stream<Integer> singleElement = Stream.of(1);   // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3


        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1, // seed
                n -> n < 100, // Predicate to specify when done
                n -> n + 2); // UnaryOperator to get next value

        oddNumberUnder100.forEach(System.out::println);

    }
}
