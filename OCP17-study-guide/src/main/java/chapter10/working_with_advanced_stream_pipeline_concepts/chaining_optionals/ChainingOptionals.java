package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals;

import java.util.Optional;

public class ChainingOptionals {


    public static void main(String[] args) {

        System.out.println("### threeDigit ###");
        threeDigit(Optional.of(10));
        threeDigit(Optional.of(100));
        threeDigit(Optional.of(1000));

        System.out.println("### threeDigitV2 ###");
        threeDigitV2(Optional.of(10));
        threeDigitV2(Optional.of(100));
        threeDigitV2(Optional.of(1000));

        System.out.println("### threeDigitV3 ###");
        threeDigitV3(Optional.of(10));
        threeDigitV3(Optional.of(100));
        threeDigitV3(Optional.of(1000));


        stringLength(Optional.of("10"));
        stringLength(Optional.of("100"));
        stringLength(Optional.of("1000"));
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

    private static void threeDigitV3(Optional<Integer> optional) {

        optional.filter(s -> s >= 100 && s <= 999)
                .ifPresent(System.out::println);
    }

    private static void stringLength(Optional<String> optional) {
        Optional<Integer> result = optional.map(String::length);
        System.out.println(result.get());
    }


}
