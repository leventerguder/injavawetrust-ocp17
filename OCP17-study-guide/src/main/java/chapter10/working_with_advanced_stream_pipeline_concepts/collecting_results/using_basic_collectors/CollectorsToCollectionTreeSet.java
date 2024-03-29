package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.TreeSet;

public class CollectorsToCollectionTreeSet {

    public static void main(String[] args) {

        String[] roseQuote = "a rose is a rose is a rose".split(" ");

        TreeSet<String> words = Arrays.stream(roseQuote).collect(Collectors.toCollection(TreeSet::new));
        words.forEach(System.out::println);
    }
}
