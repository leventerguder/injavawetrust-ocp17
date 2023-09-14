package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.grouping_partitioning_mapping;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StreamCollectorsToList {

    public static void main(String[] args) {
        String frenchCounting = "un:deux:trois:quatre";
        List gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
        gmailList.forEach(System.out::println);
    }
}
