package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.using_basic_collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class UsingBasicCollectorsJoining {

    public static void main(String[] args) {

        joiningMethod1();

        joiningMethod2();

        joiningMethod3();

        joiningMethod4();

        joiningMethod5();
    }

    private static void joiningMethod1() {
        var stream = Stream.of("lions", "tigers", "bears");
        String result = stream.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears
    }

    private static void joiningMethod2() {
        var stream = Stream.of("lions", "tigers", "bears");
        String result = stream.collect(Collectors.joining());
        System.out.println(result); // lionstigersbears
    }

    private static void joiningMethod3() {
        var stream = Stream.of("lions", "tigers", "bears");
        String result = stream.collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result); // [lions, tigers, bears]
    }

    private static void joiningMethod4() {
        IntStream stream = "injavawetrust".chars();
        //String result = stream.collect(Collectors.joining("-"));

//        String result = stream.map(i -> String.valueOf(i))
//                .collect(Collectors.joining("-"));

        String result = stream.mapToObj(i -> String.valueOf((char) i))
                .collect(Collectors.joining("-"));
        System.out.println(result); // i-n-j-a-v-a-w-e-t-r-u-s-t
    }

    private static void joiningMethod5() {
        Stream<Integer> stream = Stream.of(10, 20, 30);
        String result = stream.map(String::valueOf).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result); // [10, 20, 30]
    }


}
