package chapter10.returning_an_optional;

import java.util.Optional;

public class OptionalMapExample {

    public static void main(String[] args) {

        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim).ifPresent(System.out::println);
    }
}
