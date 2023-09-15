package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy3 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears", "bears", "fish", "fish", "bird");
        TreeMap<Integer, Set<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        System.out.println(map); //{4=[fish, bird], 5=[lions, bears], 6=[tigers]}
    }
}
