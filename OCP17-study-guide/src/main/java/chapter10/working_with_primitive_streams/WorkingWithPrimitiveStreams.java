package chapter10.working_with_primitive_streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WorkingWithPrimitiveStreams {

    public static void main(String[] args) {

        streamReduce();

        streamMapToInt();

        intStreamSum();

        intStreamReduce();

        intStreamAverage();

    }


    private static void streamReduce() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n)); // 6
    }

    private static void streamMapToInt() {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.mapToInt(x -> x).sum()); // 6
    }


    private static void intStreamSum() {
        IntStream intStream = IntStream.of(1, 2, 3);
        System.out.println(intStream.sum()); // 6.0
    }

    /*
    In fact, the sum() method of IntStream is internally implemented
    by calling reduce() method (in IntPipeline class):
     */
    private static void intStreamReduce() {
        IntStream intStream = IntStream.of(1, 2, 3);
        System.out.println(intStream.reduce(0, ((sum, val) -> sum + val))); // 6.0
    }

    private static void intStreamAverage() {
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); // 2.0
    }


}
