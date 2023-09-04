package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CreatingPrimitiveStreamWithRandom {

    public static void main(String[] args) {

        Random random = new Random();

        IntStream intStream = random.ints(5);
        intStream.forEach(System.out::println);

        System.out.println();
        LongStream longStream = random.longs(5);
        longStream.forEach(System.out::println);

        System.out.println();
        DoubleStream doubleStream = random.doubles(5);
        doubleStream.forEach(System.out::println);


    }
}
