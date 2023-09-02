package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
