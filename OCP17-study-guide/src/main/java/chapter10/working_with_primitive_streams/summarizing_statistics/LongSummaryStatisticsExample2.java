package chapter10.working_with_primitive_streams.summarizing_statistics;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class LongSummaryStatisticsExample2 {

    public static void main(String[] args) {

        LongStream longStream = LongStream.of(1, 5, 10, 20, 100);

        LongSummaryStatistics longSummaryStatistics = longStream.summaryStatistics();

        System.out.println(longSummaryStatistics.getCount());
        System.out.println(longSummaryStatistics.getMax());
        System.out.println(longSummaryStatistics.getMin());
        System.out.println(longSummaryStatistics.getSum());
    }
}
