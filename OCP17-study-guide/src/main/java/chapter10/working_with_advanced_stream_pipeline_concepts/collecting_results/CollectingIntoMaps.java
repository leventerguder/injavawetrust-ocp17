package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMaps {

    public static void main(String[] args) {

        toMapExample();

        functionIdentityExample();
    }

    private static void toMapExample() {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    }

    private static void functionIdentityExample() {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(Function.identity(), String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    }

}
