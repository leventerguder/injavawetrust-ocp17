package chapter10.returning_an_optional;

import java.util.Optional;

import static chapter10.returning_an_optional.OptionalAverageUtil.average;

public class OrElseExample1 {

    public static void main(String[] args) {

        Optional<Double> opt = average(90, 100);
        System.out.println(opt.orElse(Double.NaN));

        Optional<Double> opt2 = average();
        System.out.println(opt2.orElse(Double.NaN));

        Optional<Double> opt3 = average();
        System.out.println(opt3.orElse(1.0));
    }
}
