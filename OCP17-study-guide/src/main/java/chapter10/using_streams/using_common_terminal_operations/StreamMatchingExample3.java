package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

public class StreamMatchingExample3 {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(10, 20, 30, 40, 50);
        Stream<Integer> s2 = Stream.of(10, 20, 30, 40, 50);
        Stream<Integer> s3 = Stream.of(10, 20, 30, 40, 50);

        System.out.println(s1.allMatch(p -> p > 5));
        System.out.println(s2.noneMatch(p -> p < 5));
        System.out.println(s3.anyMatch(p -> p < 15));


    }
}
