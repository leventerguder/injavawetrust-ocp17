package chapter10.workingwithprimitivestreams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummarizingStatisticsExample {

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
}
