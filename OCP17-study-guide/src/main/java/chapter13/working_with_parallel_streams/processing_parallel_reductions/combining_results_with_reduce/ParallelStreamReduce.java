package chapter13.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_reduce;

import java.util.List;

public class ParallelStreamReduce {

    public static void main(String[] args) {

        serialStreamReduceExample();
        parallelStreamReduceExample();
        parallelStreamReduceExample2();
        parallelStreamReduceExample3();
    }

    private static void serialStreamReduceExample() {
        System.out.println(List.of('w', 'o', 'l', 'f')
                .stream()
                .reduce("",
                        (s1, c) -> s1 + c,

                        (s2, s3) ->
                        {
                            System.out.println("Not Invoked!");
                            throw new IllegalArgumentException();
                        }
                )

        ); // wolf
    }

    private static void parallelStreamReduceExample() {
        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1, c) -> s1 + c,
                        (s2, s3) -> s2 + s3)); // wolf
    }

    private static void parallelStreamReduceExample2() {
        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1, c) -> s1 + c,

                        (s2, s3) ->
                        {
                            System.out.println("Invoked!");
                            return s2 + s3;
                        }
                )

        ); // wolf
    }

    private static void parallelStreamReduceExample3() {
        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1, c) -> s1 + c,

                        (s2, s3) ->
                        {
                            System.out.println("Invoked2 : " + s2 + s3);
                            return s2 + s3;
                        }
                )

        ); // wolf
    }
}
