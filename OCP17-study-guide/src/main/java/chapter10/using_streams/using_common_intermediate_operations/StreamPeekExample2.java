package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamPeekExample2 {

    public static void main(String[] args) {

        long count = Stream.of(1, 2, 3, 4, 5)
                .map(i -> i * i)
                .filter(p -> p > 0)
                .peek(i -> System.out.printf("%d ", i))
                .count();
        System.out.printf("%nThe stream has %d elements", count);

        // https://mkyong.com/java8/java-8-stream-the-peek-is-not-working-with-count/

        /*
        the peek() method is meant primarily for debugging purposes.
        It helps us understand how the elements are transformed in the pipeline.
        Do not use it in production code.
         */
    }
}
