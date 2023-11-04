package chapter13.working_with_parallel_streams.processing_parallel_reductions;

import java.util.List;

public class ParallelStreamReduce {

    public static void main(String[] args) {

        System.out.println(List.of('w', 'o', 'l', 'f')
                .parallelStream()
                .reduce("",
                        (s1, c) -> s1 + c,
                        (s2, s3) -> s2 + s3)); // wolf
    }
}
