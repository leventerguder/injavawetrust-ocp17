package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

public class StreamMatchingExample4 {

    public static void main(String[] args) {

        allMatchExample();

        anyMatchExample();

        noneMatchExample();
    }

    private static void allMatchExample() {
        Stream<String> stream = Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        boolean answer = stream.allMatch(str -> Character.isUpperCase(str.charAt(1)));
        System.out.println(answer);
    }

    private static void anyMatchExample() {
        Stream<String> stream = Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        boolean answer = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));
        System.out.println(answer);
    }


    private static void noneMatchExample() {
        Stream<String> stream = Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        boolean answer = stream.noneMatch(str -> Character.isUpperCase(str.charAt(1)));
        System.out.println(answer);
    }
}
