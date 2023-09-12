package chapter10.working_with_primitive_streams.summarizing_statistics;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntSummaryStatisticsExample1 {

    public static void main(String[] args) {

        IntStream intStream = IntStream.rangeClosed(1, 20);

        int rangeValue = range(intStream);
        System.out.println(rangeValue);
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
}
