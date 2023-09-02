package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;

public class StreamMapExample3 {

    public static void main(String[] args) {

        Arrays.stream("4,-9,16".split(","))
                .map(Integer::parseInt)
                .map(Math::abs)
                .forEach(System.out::println);


    }
}