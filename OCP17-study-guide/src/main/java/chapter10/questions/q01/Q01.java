package chapter10.questions.q01;

import java.util.stream.Stream;

public class Q01 {

    public static void main(String[] args) {

        var stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));

        // No terminal operation is called, so the stream never executes.
        // The first line creates an infinite stream reference.
    }
}
