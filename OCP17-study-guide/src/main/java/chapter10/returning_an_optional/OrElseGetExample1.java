package chapter10.returning_an_optional;

import java.util.Optional;
import java.util.Random;

import static chapter10.returning_an_optional.OptionalAverageUtil.average;

public class OrElseGetExample1 {

    public static void main(String[] args) {

        Optional<Double> opt = average();
        System.out.println(opt.orElseGet(() -> Math.random()));


        Optional<Double> opt2 = average();
        Random random = new Random();
        System.out.println(opt2.orElseGet(random::nextDouble));
    }


}
