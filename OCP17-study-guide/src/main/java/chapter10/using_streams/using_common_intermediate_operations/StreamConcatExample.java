package chapter10.using_streams.using_common_intermediate_operations;

import java.util.stream.Stream;

public class StreamConcatExample {

    public static void main(String[] args) {

        var one = Stream.of("Bonobo");
        var two = Stream.of("Mama Gorilla", "Baby Gorilla");
        Stream.concat(one, two).forEach(System.out::println);


    }

}
