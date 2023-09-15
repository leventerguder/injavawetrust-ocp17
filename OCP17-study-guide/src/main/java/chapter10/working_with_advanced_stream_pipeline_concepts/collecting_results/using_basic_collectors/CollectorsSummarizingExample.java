package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsSummarizingExample {

    public static void main(String[] args) {

        summarizingIntMethod();

        summarizingLongMethod();

        summarizingDoubleMethod();
    }

    private static void summarizingIntMethod() {

        System.out.println("### summingIntExample ###");
        List<Integer> integerList = Arrays.asList(10, 20, 30, 40);
        Stream<Integer> integerStream = integerList.stream();

        IntSummaryStatistics intSummaryStatistics = integerStream
                .collect(Collectors.summarizingInt(e -> e));

        System.out.println("max : " + intSummaryStatistics.getMax());
        System.out.println("min : " + intSummaryStatistics.getMin());
        System.out.println("count : " + intSummaryStatistics.getCount());
        System.out.println("average : " + intSummaryStatistics.getAverage());
        System.out.println("sum : " + intSummaryStatistics.getSum());
    }

    private static void summarizingLongMethod() {

        System.out.println("### summarizingLongMethod ###");
        List<Long> longList = Arrays.asList(10L, 20L, 30L, 40L);
        Stream<Long> longStream = longList.stream();

        LongSummaryStatistics longSummaryStatistics = longStream
                .collect(Collectors.summarizingLong(e -> e));

        System.out.println("max : " + longSummaryStatistics.getMax());
        System.out.println("min : " + longSummaryStatistics.getMin());
        System.out.println("count : " + longSummaryStatistics.getCount());
        System.out.println("average : " + longSummaryStatistics.getAverage());
        System.out.println("sum : " + longSummaryStatistics.getSum());
    }

    private static void summarizingDoubleMethod() {

        System.out.println("### summarizingDoubleMethod ###");
        List<Double> doubleList = Arrays.asList(10.2, 20.1, 30.0, 40.5);
        Stream<Double> longStream = doubleList.stream();

        DoubleSummaryStatistics doubleSummaryStatistics = longStream
                .collect(Collectors.summarizingDouble(e -> e));

        System.out.println("max : " + doubleSummaryStatistics.getMax());
        System.out.println("min : " + doubleSummaryStatistics.getMin());
        System.out.println("count : " + doubleSummaryStatistics.getCount());
        System.out.println("average : " + doubleSummaryStatistics.getAverage());
        System.out.println("sum : " + doubleSummaryStatistics.getSum());
    }

}
