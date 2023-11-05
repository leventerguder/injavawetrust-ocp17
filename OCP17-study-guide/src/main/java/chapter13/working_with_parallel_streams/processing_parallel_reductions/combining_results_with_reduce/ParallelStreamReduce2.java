package chapter13.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_reduce;

import java.util.List;

public class ParallelStreamReduce2 {

    public static void main(String[] args) {


        parallelStreamReduceExample();
        serialStreamReduceExample();


        parallelStreamReduceExample2();
        serialStreamReduceExample2();
    }

    private static void parallelStreamReduceExample() {

        System.out.println("Parallel Stream : ");
        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0,
                        (a, b) ->
                        {
                            System.out.println("a : " + a + " b: " + b);
                            return (a - b);
                        }
                )); // PROBLEMATIC ACCUMULATOR
    }

    private static void serialStreamReduceExample() {
        System.out.println("SerialStream Stream : ");
        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .reduce(0,
                        (a, b) ->
                        {
                            System.out.println("a : " + a + " b: " + b);
                            return (a - b);
                        }
                ));
    }

    private static void parallelStreamReduceExample2() {
        System.out.println("Parallel Stream : ");
        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .reduce(0, (a, b) -> (a + b)));
    }

    private static void serialStreamReduceExample2() {
        System.out.println("Serial Stream : ");
        System.out.println(List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .reduce(0, (a, b) -> (a + b)));
    }

}
