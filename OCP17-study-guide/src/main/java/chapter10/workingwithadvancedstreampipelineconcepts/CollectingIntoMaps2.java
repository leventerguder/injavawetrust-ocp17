package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingIntoMaps2 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length, k -> k)); // BAD

        // Exception in thread "main" java.lang.IllegalStateException: Duplicate key 5
    }
}
