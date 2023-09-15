package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsFilteringExample {

    public static void main(String[] args) {

        List<Integer> list = Stream.of(2, 4, 6, 8, 10, 12)
                .collect(Collectors.filtering(n -> n % 4 == 0, Collectors.toList()));

        System.out.println(list);
    }
}
