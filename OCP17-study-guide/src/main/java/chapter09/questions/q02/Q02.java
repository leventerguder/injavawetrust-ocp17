package chapter09.questions.q02;

import java.util.List;

public class Q02 {

    public static void main(String[] args) {

        List<?> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");

        // q.removeIf(String::isEmpty); // DOES NOT COMPILE
        // q.removeIf(s -> s.length() == 4); // DOES NOT COMPILE
        v.removeIf(String::isEmpty);
        v.removeIf(s -> s.length() == 4);
    }
}
