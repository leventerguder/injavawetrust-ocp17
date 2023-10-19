package chapter13.working_with_parallel_streams;

import java.util.List;

public class ParallelStreamReduce2 {

    public static void main(String[] args) {

        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b))); // PROBLEMATIC ACCUMULATOR
    }
}
