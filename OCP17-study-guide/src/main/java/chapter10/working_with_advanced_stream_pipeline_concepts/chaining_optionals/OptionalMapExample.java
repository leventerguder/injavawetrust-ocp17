package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals;

import java.util.Optional;

public class OptionalMapExample {

    public static void main(String[] args) {

        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim).ifPresent(System.out::println);
    }
}
