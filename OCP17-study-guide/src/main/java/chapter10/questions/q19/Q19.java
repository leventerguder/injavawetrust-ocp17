package chapter10.questions.q19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q19 {

    public static void main(String[] args) {


        question();

        optionB();

        optionC();

    }

    private static void question() {
        System.out.println("### Question ### ");
        List<Integer> x = IntStream.range(1, 6)
                .mapToObj(i -> i)
                .collect(Collectors.toList());

        x.forEach(System.out::println);
    }

    // simplest!
    private static void optionB() {
        System.out.println("### optionB ### ");
        IntStream.range(1, 6).forEach(System.out::println);
    }

    private static void optionC() {
        System.out.println("### optionC ### ");
        IntStream.range(1, 6)
                .mapToObj(i -> i).forEach(System.out::println);
    }

}
