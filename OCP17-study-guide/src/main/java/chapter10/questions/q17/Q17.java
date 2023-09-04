package chapter10.questions.q17;

import java.util.stream.DoubleStream;

public class Q17 {

    public static void main(String[] args) {

        var s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x > 2).count();
    }
}
