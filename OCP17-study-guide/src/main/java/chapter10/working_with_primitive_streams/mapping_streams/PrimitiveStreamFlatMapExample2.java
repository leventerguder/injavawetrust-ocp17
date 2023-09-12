package chapter10.working_with_primitive_streams.mapping_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimitiveStreamFlatMapExample2 {

    public static void main(String[] args) {

        List<Integer> childList1 = Arrays.asList(1, 2, 3);
        List<Integer> childList2 = Arrays.asList(4, 5, 6);
        List<Integer> childList3 = Arrays.asList(7, 8, 9, 10);

        List<List<Integer>> mainList = Arrays.asList(
                childList1,
                childList2,
                childList3
        );


        IntStream intStream = mainList
                .stream()
                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue));

        intStream.forEach(i -> System.out.print(i + " "));

    }
}
