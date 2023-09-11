package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample5 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("first element", "second element", "third element");

        Stream<String> firstWordStream = list.stream().
                flatMap(str -> Stream.of(str.substring(0, str.indexOf(" "))));

        System.out.println(firstWordStream.toList());
    }
}
