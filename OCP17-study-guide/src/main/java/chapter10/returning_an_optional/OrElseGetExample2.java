package chapter10.returning_an_optional;

import java.util.Optional;

import static chapter10.returning_an_optional.OptionalAverageUtil.average;

public class OrElseGetExample2 {

    public static void main(String[] args) {

        Optional<Double> opt = average();
        // System.out.println(opt.orElseGet(() -> new IllegalStateException())); // DOES NOT COMPILE

        // The opt variable is an Optional<Double>. This means the Supplier must return a Double.
        // Since this Supplier returns an exception, the type does not match.

        Optional<IllegalStateException> opt2 = illegalStateException();
        System.out.println(opt2.orElseGet(() -> new IllegalStateException()));
    }


    private static Optional<IllegalStateException> illegalStateException() {
        return Optional.empty();
    }
}
