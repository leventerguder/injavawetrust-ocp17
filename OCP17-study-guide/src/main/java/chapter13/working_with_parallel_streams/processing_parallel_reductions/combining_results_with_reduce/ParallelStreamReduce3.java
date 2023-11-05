package chapter13.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_reduce;

import java.util.List;

public class ParallelStreamReduce3 {

    public static void main(String[] args) {

        System.out.println(List.of("w", "o", "l", "f").parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf
    }
}
