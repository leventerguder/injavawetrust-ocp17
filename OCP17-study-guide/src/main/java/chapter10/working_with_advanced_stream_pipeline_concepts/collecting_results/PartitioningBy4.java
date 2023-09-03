package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningBy4 {

    public static void main(String[] args) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();

        Map<Boolean, List<String>> wordBlocks =
                distinctWords.collect(Collectors.partitioningBy(str -> str.length() > 4));

        System.out.println("Short words (len <= 4): " + wordBlocks.get(false));
        System.out.println("Long words (len > 4): " + wordBlocks.get(true));
    }
}
