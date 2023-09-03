package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamPeekExample3 {

    public static void main(String[] args) {

        long count = Stream.of(1, 2, 3, 4, 5)
                .filter(p -> p > 0)
                .peek(i -> System.out.printf("%d ", i))
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i))
                .count();

        System.out.printf("%nThe stream has %d elements", count);

    }
}
