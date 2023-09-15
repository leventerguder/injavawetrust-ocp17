package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToList {

    public static void main(String[] args) {

        toListExample();
        toListExample2();
        toUnmodifiableListExample();
    }

    private static void toListExample() {
        var stream = Stream.of("lions", "tigers", "bears", "tigers");
        List<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toList());
        System.out.println(result); // [tigers, tigers]
    }

    private static void toListExample2() {
        String frenchCounting = "un:deux:trois:quatre";
        List<String> numbers = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }


    private static void toUnmodifiableListExample() {
        var stream = Stream.of("lions", "tigers", "bears", "tigers");
        List<String> result = stream
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toUnmodifiableList());
        System.out.println(result); // [tigers, tigers]

        //result.add("UnsupportedOperationException");


    }
}
