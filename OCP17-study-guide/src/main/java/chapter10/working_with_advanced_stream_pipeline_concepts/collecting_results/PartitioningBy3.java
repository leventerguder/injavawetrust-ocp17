package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningBy3 {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map); // {false=[], true=[lions, tigers, bears]}
    }
}
