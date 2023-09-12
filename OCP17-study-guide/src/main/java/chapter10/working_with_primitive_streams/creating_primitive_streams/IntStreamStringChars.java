package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.stream.IntStream;

public class IntStreamStringChars {

    public static void main(String[] args) {

        String text = "injavawetrust";

        IntStream intStream = text.chars();
        intStream.forEach(System.out::println);
    }
}
