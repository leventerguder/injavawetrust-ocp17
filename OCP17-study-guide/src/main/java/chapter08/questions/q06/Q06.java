package chapter08.questions.q06;

import java.util.function.Predicate;

public class Q06 {

    public static void main(String[] args) {

        Predicate<String> predicate1 = s -> s.isEmpty();
        Predicate<String> predicate2 = (String s) -> s.isEmpty();
    }
}
