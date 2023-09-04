package chapter10.questions.q21;

import java.util.stream.Stream;

public class Q21 {

    public static void main(String[] args) {

        var spliterator = Stream.generate(() -> "x").spliterator();
        spliterator.tryAdvance(System.out::print);
        var split = spliterator.trySplit();
        split.tryAdvance(System.out::print);
    }
}
