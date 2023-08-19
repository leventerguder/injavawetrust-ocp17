package chapter08.questions.q18;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Q18 {


    public static void main(String[] args) {

        BiConsumer<String, String> m = (s1, s2) -> {
        };
        BiConsumer<String, String> n = (s1, s2) -> {
        };

        Supplier<String> x = String::new;
        BiConsumer<String, String> y = m.andThen(n);
        UnaryOperator<String> z = a -> a + a;
    }

}
