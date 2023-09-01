package chapter10.returning_an_optional;

import java.util.Optional;

import static chapter10.returning_an_optional.OptionalAverageUtil.average;

public class DealingWithAnEmptyOptional {

    public static void main(String[] args) {

        Optional<Double> opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
    }

}
