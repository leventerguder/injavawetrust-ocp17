package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals;

import java.util.Optional;

public class ChainingOptionals {


    public static void main(String[] args) {

        threeDigit(Optional.of(10));
        threeDigit(Optional.of(100));
        threeDigit(Optional.of(1000));


        threeDigitV2(Optional.of(10));
        threeDigitV2(Optional.of(100));
        threeDigitV2(Optional.of(1000));


        optionalString(Optional.of("10"));
        optionalString(Optional.of("100"));
        optionalString(Optional.of("1000"));
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    private static void threeDigitV2(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }

    private static void optionalString(Optional<String> optional) {
        Optional<Integer> result = optional.map(String::length);
        System.out.println(result.get());
    }


}
