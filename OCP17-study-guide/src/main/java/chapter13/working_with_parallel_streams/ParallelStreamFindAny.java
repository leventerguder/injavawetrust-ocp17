package chapter13.working_with_parallel_streams;

import java.util.List;

public class ParallelStreamFindAny {

    public static void main(String[] args) {

        System.out.print(List.of(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .findAny()
                .get());
    }
}
