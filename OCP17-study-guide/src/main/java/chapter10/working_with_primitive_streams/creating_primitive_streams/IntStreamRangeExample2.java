package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.stream.IntStream;

public class IntStreamRangeExample2 {
    public static void main(String[] args) {

        IntStream.rangeClosed(0, 10)
                .filter(IntStreamRangeExample2::isEven)
                .forEach(System.out::println);

    }

    static boolean isEven(int i) {
        return i % 2 == 0;
    }
}
