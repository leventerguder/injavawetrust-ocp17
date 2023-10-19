package chapter13.working_with_parallel_streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AvoidingStatefulStreams {

    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> {
                    data.add(i);
                }); // STATEFUL: DON'T DO THIS!
        return data;
    }

    public static void main(String[] args) {

        var list = addValues(IntStream.range(1, 11));
        System.out.println(list); // [2, 4, 6, 8, 10]


        var list2 = addValues(IntStream.range(1, 11).parallel());
        System.out.println(list2); // [6, 8, 10, 2, 4]

        var list3 = addValuesBetter(IntStream.range(1, 11));
        System.out.println(list3); // [2, 4, 6, 8, 10]


        var list4 = addValuesBetter(IntStream.range(1, 11).parallel());
        System.out.println(list4); //[2, 4, 6, 8, 10]


    }

    public static List<Integer> addValuesBetter(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
