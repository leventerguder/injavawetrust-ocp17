package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamSkipAndLimitExample2 {

    public static void main(String[] args) {

        System.out.println("### skip ###");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(i -> System.out.print(i + " "));

        System.out.println();
        System.out.println("### limit ###");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .limit(2)
                .forEach(i -> System.out.print(i + " "));
    }
}
