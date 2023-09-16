package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByMapping {

    public static void main(String[] args) {

        mappingMethod1();

        mappingMethod2();
    }

    private static void mappingMethod1() {
        var ohMy = Stream.of("lions", "tigers", "bears", "cat", "dog", "bird", "fish", "chicken");
        Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.mapping(
                        s -> s.charAt(0),
                        Collectors.minBy((a, b) -> a - b))));
        System.out.println(map); // {3=Optional[c], 4=Optional[b], 5=Optional[b], 6=Optional[t], 7=Optional[c]}
    }

    private static void mappingMethod2() {


        var ohMy = Stream.of("lions", "tigers", "bears", "cat", "dog", "bird", "fish", "chicken");
        Map<Integer, Optional<String>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s ->s.toUpperCase(),
                                Collectors.minBy(String::compareTo)
                        )
                ));
        System.out.println(map); // {3=Optional[dog], 4=Optional[bird], 5=Optional[lions], 6=Optional[tigers], 7=Optional[chicken]}
    }
}
