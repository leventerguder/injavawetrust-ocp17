package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

public class StreamMatchingExample6 {

    public static void main(String[] args) {

        anyMatchExample1();

        anyMatchExample2Hangs();
    }


    private static void anyMatchExample1() {
        Stream<String> infinite = Stream.generate(() -> "chimp");
        boolean result = infinite.anyMatch(s -> s.length() > 3);
        System.out.println(result);

    }

    private static void anyMatchExample2Hangs() {
        Stream<String> infinite = Stream.generate(() -> "chimp");
        boolean result = infinite.anyMatch(s -> s.length() > 10); // hangs!
        System.out.println(result);
    }
}
