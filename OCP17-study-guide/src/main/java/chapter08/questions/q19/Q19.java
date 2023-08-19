package chapter08.questions.q19;

import java.util.Set;
import java.util.function.Consumer;

public class Q19 {

    public static void main(String[] args) {

        Set<?> set = Set.of("lion", "tiger", "bear");
        var s = Set.copyOf(set);
        Consumer<Object> consumer = System.out::println;
        s.forEach(consumer);
    }
}
