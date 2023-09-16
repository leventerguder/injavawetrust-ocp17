package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.teeing_collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TeeingCollectors2 {

    public static void main(String[] args) {

        double average = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (sum, count) -> sum / count
                        ));

        System.out.println(average);

        double average2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8).average().getAsDouble();
        System.out.println(average2);
    }
}
