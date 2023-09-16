package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.teeing_collectors;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectors {

    public static void main(String[] args) {

        teeingMethod1();
        teeingMethod2();

    }

    private static void teeingMethod1() {
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c))
                );
        System.out.println(result);
    }

    private static void teeingMethod2() {
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining("|"),
                        Collectors.joining("-"),
                        Separations::new)
                );
        System.out.println(result);
    }
}
