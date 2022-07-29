package chapter10.usingstreams;

import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample {

    public static void main(String[] args) {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(m -> m.stream()).forEach(System.out::println);

    }

}
