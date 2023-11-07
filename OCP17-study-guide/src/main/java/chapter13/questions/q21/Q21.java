package chapter13.questions.q21;

import java.util.List;

public class Q21 {

    public static void main(String[] args) {

        var data = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));

        data.stream().flatMap(s -> s.stream()).findFirst().ifPresent(System.out::print);

        data.parallelStream().flatMap(s -> s.stream()).findFirst().ifPresent(System.out::print);
    }
}
