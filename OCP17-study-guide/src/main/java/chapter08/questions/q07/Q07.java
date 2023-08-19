package chapter08.questions.q07;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Q07 {

    public void method() {
        x((var x) -> {
        }, (var x, var y) -> false);
    }

    public void x(Consumer<String> x, BinaryOperator<Boolean> y) {
    }
}
