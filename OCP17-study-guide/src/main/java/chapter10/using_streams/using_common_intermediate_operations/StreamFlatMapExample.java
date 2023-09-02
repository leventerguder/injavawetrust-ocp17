package chapter10.using_streams.using_common_intermediate_operations;

import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample {

    public static void main(String[] args) {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(m -> m.stream()).forEach(System.out::println);

        // As you can see, it removed the empty list completely and changed all elements of each list to be
        // at the top level of the stream.
    }

}
