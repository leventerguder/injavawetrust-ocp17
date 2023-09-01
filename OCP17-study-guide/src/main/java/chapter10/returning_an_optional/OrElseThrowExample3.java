package chapter10.returning_an_optional;

import java.util.Optional;

import static chapter10.returning_an_optional.OptionalAverageUtil.average;

public class OrElseThrowExample3 {

    public static void main(String[] args) {

        Optional<Double> opt = average();
        System.out.println(opt.orElseThrow(IllegalStateException::new));
    }

}
