package chapter13.working_with_parallel_streams.creating_parallel_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExample2 {

    public static void main(String[] args) {


        System.out.println("Normal...");

        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + ", value: " + x);
        });


        System.out.println("range.isParallel() : " + range.isParallel());
        System.out.println("range2.isParallel() :" + range2.isParallel());

    }


}
