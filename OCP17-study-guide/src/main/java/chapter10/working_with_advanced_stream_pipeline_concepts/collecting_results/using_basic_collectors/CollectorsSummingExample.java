package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsSummingExample {

    public static void main(String[] args) {

        summingIntExample();

        summingLongExample();

        summingDoubleExample();
    }

    private static void summingIntExample() {

        System.out.println("### summingIntExample ###");
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> integerStream = integerList.stream();

        int sumOfElements = integerStream.collect(Collectors.summingInt(e -> e));

        System.out.println("Sum of the stream : " + sumOfElements);
    }

    private static void summingLongExample() {

        System.out.println("### summingLongExample ###");
        List<Long> integerList = Arrays.asList(10L, 20L, 30L, 40L);
        Stream<Long> longStream = integerList.stream();

        long sumOfElements = longStream.collect(Collectors.summingLong(e -> e));

        System.out.println("Sum of the stream : " + sumOfElements);
    }

    private static void summingDoubleExample() {

        System.out.println("### summingDoubleExample ###");
        List<Double> doubleList = Arrays.asList(10.5, 20.1, 30.5, 40d);
        Stream<Double> doubleStream = doubleList.stream();

        double sumOfElements = doubleStream.collect(Collectors.summingDouble(e -> e));

        System.out.println("Sum of the stream : " + sumOfElements);
    }
}
