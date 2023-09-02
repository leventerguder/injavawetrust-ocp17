package chapter10.using_streams.using_common_intermediate_operations;

import java.util.List;
import java.util.stream.Stream;

public class StreamFilteringExample {

    public static void main(String[] args) {

        filterExample1();
        filterExample2();
    }

    private static void filterExample1() {
        System.out.println("### filterExample1 ###");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::print); // monkey
    }

    private static void filterExample2() {

        System.out.println("### filterExample2 ###");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        stream.filter(num -> num % 2 == 0).forEach(System.out::println);
    }

}
