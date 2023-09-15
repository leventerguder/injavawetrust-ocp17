package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy6Mapping {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears", "cat", "dog", "bird", "chicken");
        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.mapping(
                        s -> s.charAt(0),
                        Collectors.minBy((a, b) -> a - b))));
        System.out.println(map); // {3=Optional[c], 4=Optional[b], 5=Optional[b], 6=Optional[t], 7=Optional[c]}
    }
}
