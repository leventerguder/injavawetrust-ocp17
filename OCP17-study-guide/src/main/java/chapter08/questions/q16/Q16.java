package chapter08.questions.q16;

import java.util.List;
import java.util.function.Predicate;

public class Q16 {

    public void remove(List<Character> chars) {
        char end = 'z';

        // Variable 'start' is already defined in the scope
        // char start = 'a';

        // Variable 'c' is already defined in the scope
        // char c = 'x';

        chars = null;

        // Variable used in lambda expression should be final or effectively final
        // end = '1';

        Predicate<Character> predicate = c -> {
            char start = 'a';
            return start <= c && c <= end;
        };
    }
}
