package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.Arrays;
import java.util.List;

public class StreamMapToIntExample2 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("3", "6", "8", "14", "15");

        list.stream().mapToInt(Integer::parseInt)
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);
    }
}
