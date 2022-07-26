package chapter10.usingstreams;

import java.util.stream.Stream;

public class StreamCountingExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3

    }
}
