package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsCountingExample {

    public static void main(String[] args) {

        System.out.println("### Stream.empty ###");
        long count = Stream.empty().collect(Collectors.counting());
        System.out.println("count : " + count);

        System.out.println("### Stream.of ###");
        long count2 = Stream.of("laptop", "monitor", "keyboard", "mouse")
                .collect(Collectors.counting());
        System.out.println("count2 : " + count2);
    }
}
