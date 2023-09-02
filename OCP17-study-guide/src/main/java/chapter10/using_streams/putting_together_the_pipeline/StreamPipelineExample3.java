package chapter10.using_streams.putting_together_the_pipeline;

import java.util.stream.Stream;

public class StreamPipelineExample3 {

    public static void main(String[] args) {
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
    }
}
