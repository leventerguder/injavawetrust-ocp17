package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy4 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map);
    }
}
