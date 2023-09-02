package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsingBasicCollectorsAveragingInt {

    public static void main(String[] args) {

        averagingIntExample1();


        averagingIntExample2();
    }

    private static void averagingIntExample1() {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result); // 5.333333333333333
    }


    private static void averagingIntExample2() {
        Stream<Integer> stream = Stream.of(10, 20, 30);
        ToIntFunction<Integer> mapper = e -> e + 5;
        Double result = stream.collect(Collectors.averagingInt(mapper));
        System.out.println(result);
    }
}
