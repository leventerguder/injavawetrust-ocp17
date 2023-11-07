package chapter13.questions.q06;

import java.util.List;

public class Q06 {

    public static void main(String[] args) {

        var data = List.of(2, 5, 1, 9, 8);
        data.stream().parallel()
                .mapToInt(s -> s)
                .peek(System.out::print)
                .forEachOrdered(System.out::print);

        // C. The peek() method will print the entries in an order that cannot be determined ahead of time.
        // E. The forEachOrdered() method will print the entries in the original order: 25198.
    }
}
