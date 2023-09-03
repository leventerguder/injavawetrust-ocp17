package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamFlatMapExample3 {

    public static void main(String[] args) {

        List<List<Integer>> intsOfInts = Arrays.asList(
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 4));

        intsOfInts.stream()
                //.flatMap(ints -> ints.stream())
                .flatMap(Collection::stream)
                .sorted()
                .map(i -> i * i)
                .forEach(System.out::println);

        /*
        the flatMap() method operates on elements just like map() method. however, flatMap() flattens the
        streams that result from mapping each of its elements into one flat stream.
         */
    }
}
