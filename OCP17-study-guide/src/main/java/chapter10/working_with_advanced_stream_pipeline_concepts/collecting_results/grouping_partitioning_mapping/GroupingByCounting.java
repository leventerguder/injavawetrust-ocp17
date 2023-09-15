package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByCounting {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears", "cat", "dog", "bird", "chicken");
        Map<Integer, Long> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map); // {3=2, 4=1, 5=2, 6=1, 7=1}
    }
}
