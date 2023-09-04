package chapter10.questions.q03;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Q03 {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.length() > 3;
        var stream = Stream.iterate("-",
                s -> !s.isEmpty(), (s) -> s + s);

        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate); //IllegalStateException
        System.out.println(b1 + " " + b2);
    }
}
