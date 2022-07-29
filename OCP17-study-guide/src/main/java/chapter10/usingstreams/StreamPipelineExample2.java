package chapter10.usingstreams;

import java.util.stream.Stream;

public class StreamPipelineExample2 {

    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
