package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class UsingBasicCollectorsAveragingDouble {

    public static void main(String[] args) {

        averagingDoubleMethod();
    }


    private static void averagingDoubleMethod() {
        Stream<Double> stream = Stream.of(1.2, 2.6, 5.9);
        Double result = stream.collect(Collectors.averagingDouble(e -> e + 5.5));
        System.out.println(result);
    }
}
