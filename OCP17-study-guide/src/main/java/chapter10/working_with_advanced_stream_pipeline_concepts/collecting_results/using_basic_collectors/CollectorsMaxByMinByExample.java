package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectorsMaxByMinByExample {

    public static void main(String[] args) {

        collectorsMaxBy();

        collectorsMinBy();

    }

    private static void collectorsMaxBy() {

        System.out.println("### collectorsMaxBy ###");
        IntStream intStream = IntStream.of(60, 5, 3, 10, 1, 2, 40);

        Optional<Integer> optionalMax = intStream.boxed()
                .collect(Collectors.maxBy(Comparator.naturalOrder()));

        optionalMax.ifPresent(System.out::println);
    }

    private static void collectorsMinBy() {

        System.out.println("### collectorsMinBy ###");
        IntStream intStream = IntStream.of(60, 5, 3, 10, 1, 2, 40);

        Optional<Integer> optionalMax = intStream.boxed()
                .collect(Collectors.minBy(Comparator.naturalOrder()));

        optionalMax.ifPresent(System.out::println);
    }
}
