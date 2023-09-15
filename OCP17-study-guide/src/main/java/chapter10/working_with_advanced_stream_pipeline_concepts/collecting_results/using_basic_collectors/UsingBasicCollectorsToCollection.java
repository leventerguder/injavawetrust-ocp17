package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectorsToCollection {

    public static void main(String[] args) {

        toCollectionExample();

        toSetExample();

        toListExample();

        toUnmodifiableListExample();
    }

    private static void toCollectionExample() {
        var ohMy = Stream.of("lions", "tigers", "bears", "tigers");
        TreeSet<String> result = ohMy
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result); // [tigers]
    }

    private static void toSetExample() {
        var stream = Stream.of("lions", "tigers", "bears", "tigers");
        Set<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toSet());
        System.out.println(result); // [tigers]
    }

    private static void toListExample() {
        var stream = Stream.of("lions", "tigers", "bears", "tigers");
        List<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toList());
        System.out.println(result); // [tigers, tigers]
    }

    private static void toUnmodifiableListExample() {
        var stream = Stream.of("lions", "tigers", "bears", "tigers");
        List<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(result); // [tigers, tigers]

       //result.add("UnsupportedOperationException");


    }
}
