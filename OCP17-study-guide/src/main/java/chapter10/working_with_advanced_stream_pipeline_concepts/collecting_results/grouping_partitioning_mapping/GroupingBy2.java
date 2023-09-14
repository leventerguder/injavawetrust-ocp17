package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy2 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears", "bears", "bears");
        Map<Integer, Set<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
