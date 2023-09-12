package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamFlatMapExample {

    public static void main(String[] args) {

        var integerList = List.of(1, 5, 20, 4, 3, 7, 11);

        IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
        ints.forEach(i -> System.out.print(i + ","));

        DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));
        System.out.println("sum : " + doubles.sum());

        LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));
        System.out.println("min : " + longs.min());
    }
}
