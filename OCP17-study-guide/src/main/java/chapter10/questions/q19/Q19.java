package chapter10.questions.q19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q19 {

    public static void main(String[] args) {


        method();

        optionB();

    }

    private static void optionB() {
        IntStream.range(1, 6) .forEach(System.out::println);
    }

    private static void method() {
        List<Integer> x = IntStream.range(1, 6)
                .mapToObj(i -> i)
                .collect(Collectors.toList());

        x.forEach(System.out::println);
    }
}
