package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningBy {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears", "cat", "dog", "crocodile");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers, crocodile], true=[lions, bears, cat, dog]}
    }
}