package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectorsToMap {

    public static void main(String[] args) {

        toMapV1();
        toMapV2();

    }

    private static void toMapV1() {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }

    private static void toMapV2() {
        Map<String, Integer> nameLength = Stream.of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(Function.identity(), String::length));
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }
}
