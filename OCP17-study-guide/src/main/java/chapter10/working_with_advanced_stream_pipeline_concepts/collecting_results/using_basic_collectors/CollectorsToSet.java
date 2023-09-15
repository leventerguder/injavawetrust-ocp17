package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToSet {

    public static void main(String[] args) {

        toSetExample1();
        toSetExample2();
    }

    private static void toSetExample1() {
        var stream = Stream.of("lions", "tigers", "bears", "tigers");
        Set<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toSet());
        System.out.println(result); // [tigers]
    }

    private static void toSetExample2() {
        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set<String> words = Arrays.stream(roseQuote).collect(Collectors.toSet());
        words.forEach(System.out::println);
    }


}
