package chapter10.workingwithprimitivestreams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitiveExample2 {

    public static void main(String[] args) {

        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        OptionalDouble min = doubles.min(); // runs infinitely
    }
}
