package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamMapExample2 {

    public static void main(String[] args) {

        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numberStream.map(i -> i * 5).forEach(e -> System.out.print(e + " "));
    }
}
