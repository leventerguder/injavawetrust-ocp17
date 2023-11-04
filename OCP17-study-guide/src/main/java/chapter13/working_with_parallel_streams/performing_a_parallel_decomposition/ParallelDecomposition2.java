package chapter13.working_with_parallel_streams.performing_a_parallel_decomposition;

import java.util.stream.IntStream;

public class ParallelDecomposition2 {

    public static void main(String[] args) throws InterruptedException {


        IntStream range = IntStream.rangeClosed(1, 10);
        range.forEach((int i) ->
                {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
        );

        System.out.println("Parallel...");

        IntStream range2 = IntStream.rangeClosed(1, 10);
        range2.parallel().forEach((int i) ->
                {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
        );
    }
}
