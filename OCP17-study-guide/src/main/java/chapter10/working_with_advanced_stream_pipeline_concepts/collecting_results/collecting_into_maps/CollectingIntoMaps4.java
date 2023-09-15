package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.collecting_into_maps;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMaps4 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears", "dog", "cat", "bird", "fish");
        TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map); // // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class java.util.TreeMap
    }
}
