package chapter10.workingwithprimitivestreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamExample {

    public static void main(String[] args) {

        streamReduce();

        streamMapToInt();

        intStreamSum();

        intStreamAverage();

    }

    private static void intStreamSum() {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.stream().sum()); // 6.0
    }

    private static void intStreamAverage() {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); // 2.0
    }

    private static void streamMapToInt() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum()); // 6
    }

    private static void streamReduce() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n)); // 6
    }
}
