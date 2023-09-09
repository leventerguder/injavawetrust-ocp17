package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

public class StreamMatchingExample5 {

    public static void main(String[] args) {

        allMatchExample1();

        allMatchExample2Hangs();
    }


    private static void allMatchExample1() {
        Stream<String> infinite = Stream.generate(() -> "chimp");
        boolean result = infinite.allMatch(s -> s.length() > 10);
        System.out.println(result);

    }

    private static void allMatchExample2Hangs() {
        Stream<String> infinite = Stream.generate(() -> "chimp");
        boolean result = infinite.allMatch(s -> s.length() > 4); // hangs!
        System.out.println(result);
    }
}
