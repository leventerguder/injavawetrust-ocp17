package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

public class StreamMatchingExample7 {

    public static void main(String[] args) {

        noneMatchExample1();

        noneMatchExample2Hangs();
    }


    private static void noneMatchExample1() {
        Stream<String> infinite = Stream.generate(() -> "chimp");
        boolean result = infinite.noneMatch(s -> s.length() > 3);
        System.out.println(result);

    }

    private static void noneMatchExample2Hangs() {
        Stream<String> infinite = Stream.generate(() -> "chimp");
        boolean result = infinite.noneMatch(s -> s.length() > 10); // hangs!
        System.out.println(result);
    }
}
