package chapter10.workingwithprimitivestreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalPrimitiveExample {

    public static void main(String[] args) {

        var stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();

        optional.ifPresent(System.out::println); // 5.5
        System.out.println(optional.getAsDouble()); // 5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5
    }
}
