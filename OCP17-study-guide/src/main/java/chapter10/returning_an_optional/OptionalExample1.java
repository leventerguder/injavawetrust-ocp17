package chapter10.returning_an_optional;

import java.util.List;
import java.util.Optional;

public class OptionalExample1 {

    public static void main(String[] args) {

        Optional<Integer> optional1 = Optional.empty();
        Optional<Integer> optional2 = Optional.of(10);
        Optional<String> optional3 = Optional.of("sample-content");
        Optional<List<Integer>> optional4 = Optional.of(List.of(10,20,30));
        Optional<Double> optional5 = Optional.ofNullable(null);


        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println(optional4);
        System.out.println(optional5);
    }
}
