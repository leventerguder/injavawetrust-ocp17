package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {

        groupingByMethod1();
        groupingByMethod2();
        // groupingByMethod3(); // NullPointerException
    }

    private static void groupingByMethod1() {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
        System.out.println(map.getClass()); // java.util.HashMap
    }

    private static void groupingByMethod2() {
        Stream<String> ohMy = Stream.empty();
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map); // {}
    }

    private static void groupingByMethod3() {
        Stream<String> ohMy = Stream.of(null, "element1");
        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length)); // NullPointerException
        System.out.println(map); // {}
    }
}
