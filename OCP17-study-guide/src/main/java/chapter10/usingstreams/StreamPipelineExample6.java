package chapter10.usingstreams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineExample6 {

    public static void main(String[] args) {

        long count = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println(count); // 1
    }
}
