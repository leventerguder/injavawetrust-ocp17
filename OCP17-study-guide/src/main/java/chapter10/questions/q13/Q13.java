package chapter10.questions.q13;

import java.util.List;
import java.util.stream.Stream;

public class Q13 {

    public static void main(String[] args) {

        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();

//        Stream.of(x1, x2, x3)
//                .map(x -> x + 1) // DOES NOT COMPILE
//                .flatMap(x -> x.stream())
//                .forEach(System.out::print);

        Stream.of(x1, x2, x3)
                .flatMap(x -> x.stream())
                .map(x -> x + 1)
                .forEach(System.out::print);
    }
}
