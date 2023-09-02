package chapter10.using_streams.putting_together_the_pipeline;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineExample5 {

    public static void main(String[] args) {

        long count = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println(count); // 1
    }
}
