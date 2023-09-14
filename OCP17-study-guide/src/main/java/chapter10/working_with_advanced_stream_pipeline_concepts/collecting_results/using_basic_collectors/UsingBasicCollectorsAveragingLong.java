package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectorsAveragingLong {

    public static void main(String[] args) {

        averagingLongMethod();
    }


    private static void averagingLongMethod() {
        Stream<Long> stream = Stream.of(100L, 200L, 300L);
        Double result = stream.collect(Collectors.averagingLong(e -> e * 2));
        System.out.println(result);
    }
}
