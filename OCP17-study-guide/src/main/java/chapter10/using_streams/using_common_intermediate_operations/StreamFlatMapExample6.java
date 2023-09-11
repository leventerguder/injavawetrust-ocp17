package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMapExample6 {

    public static void main(String[] args) {

        // https://mkyong.com/java8/java-8-flatmap-example/

        methodV1();

        methodV2();

        methodV3();

        methodV4();
    }

    private static void methodV1() {

        System.out.println("### methodV1 ###");
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // convert array to a stream
        Stream<String[]> stream1 = Arrays.stream(array);

        List<String[]> result = stream1
                .filter(x -> !x.equals("a"))      // x is a String[], not String!
                .collect(Collectors.toList());

        System.out.println(result.size());    // 3

        result.forEach(System.out::println);  // print nothing?
    }


    private static void methodV2() {
        System.out.println("### methodV2 ###");
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // array to a stream
        Stream<String[]> stream1 = Arrays.stream(array);

        // x is a String[]
        List<String[]> result = stream1
                .filter(x -> {
                    for (String s : x) {      // really?
                        if (s.equals("a")) {
                            return false;
                        }
                    }
                    return true;
                }).collect(Collectors.toList());

        // print array
        result.forEach(x -> System.out.println(Arrays.toString(x)));
    }


    private static void methodV3() {

        System.out.println("### methodV3 ###");
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        String[] result = Stream.of(array)  // Stream<String[]>
                .flatMap(Stream::of)        // Stream<String>
                .toArray(String[]::new);    // [a, b, c, d, e, f]

        for (String s : result) {
            System.out.println(s);
        }
    }

    private static void methodV4() {

        System.out.println("### methodV4 ###");
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        List<String> collect = Stream.of(array)     // Stream<String[]>
                .flatMap(Stream::of)                // Stream<String>
                .filter(x -> !"a".equals(x))        // filter out the a
                .collect(Collectors.toList());      // return a List

        collect.forEach(System.out::println);
    }

}
