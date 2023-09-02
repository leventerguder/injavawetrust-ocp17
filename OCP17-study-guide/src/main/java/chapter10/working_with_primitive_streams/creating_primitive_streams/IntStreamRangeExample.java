package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.stream.IntStream;

public class IntStreamRangeExample {
    public static void main(String[] args) {

        System.out.println("### range ##");
        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345

        System.out.println();
        System.out.println("### rangeClosed ### ");
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345

        System.out.println();
        System.out.println("### rangeClosed - 2### ");
        IntStream.rangeClosed(1, 1).forEach(System.out::println);
    }
}
