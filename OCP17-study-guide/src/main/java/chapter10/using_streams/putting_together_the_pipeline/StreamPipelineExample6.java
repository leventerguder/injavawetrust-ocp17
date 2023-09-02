package chapter10.using_streams.putting_together_the_pipeline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipelineExample6 {

    public static void main(String[] args) {


        List<String> helper = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        long count = helper.stream().count();
        System.out.println(count);
    }
}
