package chapter10.using_streams.creating_stream_sources;

import java.util.stream.Stream;

public class CreatingFiniteStreamsExample2 {

    public static void main(String[] args) {


        iterateOddNumberUnder100();

        iterateV1();

        iterateV2();

        iterateV3();

    }

    private static void iterateOddNumberUnder100() {
        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1, // seed
                n -> n < 100, // Predicate to specify when done
                n -> n + 2); // UnaryOperator to get next value

        oddNumberUnder100.forEach(System.out::println);
    }


    private static void iterateV1() {
        System.out.println("### iterateV1 ###");
        Stream<Integer> stream = Stream.iterate(
                1,
                n -> n < 1,
                n -> n + 2);

        stream.forEach(System.out::println);
    }

    private static void iterateV2() {
        System.out.println("### iterateV2 ###");
        Stream<Integer> stream = Stream.iterate(
                1,
                n -> n < 2,
                n -> n + 2);

        stream.forEach(System.out::println);
    }


    private static void iterateV3() {
        System.out.println("### iterateV3 ###");
        Stream<Integer> stream = Stream.iterate(
                1,
                n -> n < 4,
                n -> n + 2);

        stream.forEach(System.out::println);
    }
}
