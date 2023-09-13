package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals;

import java.util.Optional;

public class ChainingOptionals2 {

    public static void main(String[] args) {

        optionalMapExample();

        optionalMapExample2();

        optionalMethods();

    }

    private static void optionalMapExample() {

        System.out.println("### optionalMapExample ### ");
        Optional<String> optional = Optional.of("value");
        String upperCase = optional.
                map(String::toUpperCase)
                .get();
        System.out.println(upperCase);
    }

    private static void optionalMapExample2() {

        System.out.println("### optionalMapExample2 ### ");
        Optional<String> string = Optional.of("  abracadabra  ");
        string.map(String::trim)
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }


    private static void optionalMethods() {

        System.out.println("### optionalMethods ### ");
        Optional<String> optional = Optional.of("sample");
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        optional.ifPresent(System.out::println);
    }
}
