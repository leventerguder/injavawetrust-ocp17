package chapter10.working_with_primitive_streams.summarizing_statistics;

import java.util.DoubleSummaryStatistics;
import java.util.stream.DoubleStream;

public class DoubleSummaryStatisticsExample {

    public static void main(String[] args) {

        DoubleStream doubleStream = DoubleStream.of(1, 5, 10, 20, 100);

        DoubleSummaryStatistics doubleSummaryStatistics = doubleStream.summaryStatistics();

        System.out.println(doubleSummaryStatistics.getCount());
        System.out.println(doubleSummaryStatistics.getMax());
        System.out.println(doubleSummaryStatistics.getMin());
        System.out.println(doubleSummaryStatistics.getSum());
    }
}
