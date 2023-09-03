package chapter10.working_with_primitive_streams.summarizing_statistics;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

public class IntSummaryStatisticsExample2 {
    public static void main(String[] args) {

        String limerick = "There was a young lady named Bright " +
                "who traveled much faster than light " +
                "She set out one day " +
                "in a relative way " +
                "and came back the previous night ";

        IntSummaryStatistics wordStatistics =
                Pattern.compile(" ")
                        .splitAsStream(limerick)
                        .mapToInt(String::length)
                        .summaryStatistics();

        System.out.printf("""
                        Number of words = %d
                        Sum of the length of the words = %d
                        Minimum word size = %d
                        Maximum word size %d
                        Average word size = %f
                        """,
                wordStatistics.getCount(),
                wordStatistics.getSum(),
                wordStatistics.getMin(),
                wordStatistics.getMax(),
                wordStatistics.getAverage());
    }
}
