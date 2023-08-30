package chapter09.questions.q02;

import java.util.List;

public class Q02 {

    public static void main(String[] args) {

        List<?> q = List.of("mouse", "parrot");
        var v = List.of("mouse", "parrot");

        // a List<?>, which means it is treated as if all the elements are of type Object rather than String.

        // q.removeIf(String::isEmpty); // DOES NOT COMPILE
        // q.removeIf(s -> s.length() == 4); // DOES NOT COMPILE
        v.removeIf(String::isEmpty); // UnsupportedOperationException
        v.removeIf(s -> s.length() == 4);
    }
}
