package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.stream.IntStream;

public class IntStreamIterateExample {

    public static void main(String[] args) {

        IntStream count = IntStream
                .iterate(1, n -> n + 1)
                .limit(5);
        count.forEach(System.out::println);
    }
}
