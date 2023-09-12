package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamFlatMapExample4 {

    public static void main(String[] args) {

        String[][] arrayOfArrays = {{"1", "2"}, {"5", "6"}, {"3", "4"}};

        IntStream intStream = Arrays.stream(arrayOfArrays)
                .flatMapToInt(childArray -> Arrays.stream(childArray)
                        .mapToInt(Integer::parseInt));

        intStream.forEach(i -> System.out.print(i + " "));

    }
}
