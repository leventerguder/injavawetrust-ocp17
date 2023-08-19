package chapter08.questions.q12;

import java.util.function.Function;

public class Q12 {

    public static void main(String[] args) {

        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.print(c.apply(1));
    }
}
