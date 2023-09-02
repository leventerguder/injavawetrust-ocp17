package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectorsToCollection {

    public static void main(String[] args) {

        toCollectionExample();

        toSetExample();
    }

    private static void toCollectionExample() {
        var ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result = ohMy
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result); // [tigers]
    }

    private static void toSetExample() {
        var stream = Stream.of("lions", "tigers", "bears");
        Set<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toSet());
        System.out.println(result); // [tigers]
    }
}
