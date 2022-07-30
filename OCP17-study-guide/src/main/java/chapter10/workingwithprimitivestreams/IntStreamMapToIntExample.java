package chapter10.workingwithprimitivestreams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamMapToIntExample {

    public static void main(String[] args) {

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
    }
}
