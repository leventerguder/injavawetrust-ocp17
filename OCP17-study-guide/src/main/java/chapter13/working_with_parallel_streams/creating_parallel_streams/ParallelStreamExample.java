package chapter13.working_with_parallel_streams.creating_parallel_streams;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {


        System.out.println("Serial Stream : ");

        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(System.out::println);

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(System.out::println);
    }

}
