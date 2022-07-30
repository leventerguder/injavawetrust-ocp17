package chapter10.workingwithprimitivestreams;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamFlatMapExample {

    public static void main(String[] args) {

        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));

        DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));

        LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));
    }
}
