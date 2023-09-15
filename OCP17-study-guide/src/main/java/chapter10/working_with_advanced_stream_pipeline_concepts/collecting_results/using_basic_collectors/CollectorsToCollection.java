package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToCollection {

    public static void main(String[] args) {

        toCollectionExample();
    }

    private static void toCollectionExample() {
        var ohMy = Stream.of("lions", "tigers", "bears", "tigers");
        TreeSet<String> result = ohMy
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result); // [tigers]
    }

}
