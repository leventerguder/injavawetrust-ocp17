package chapter10.working_with_primitive_streams.using_optional_with_primitive_streams;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class OptionalPrimitiveExample {

    public static void main(String[] args) {

        intStreamMethod();
        longStreamMethod();
        doubleStreamMethod();
    }

    private static void intStreamMethod() {

        System.out.println("### intStreamMethod ###");
        var stream = IntStream.rangeClosed(1, 10);
        OptionalDouble optional = stream.average();
        optional.ifPresent(System.out::println); // 5.5
        System.out.println(optional.getAsDouble()); // 5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5

        int sum = IntStream.empty().sum();
        System.out.println(sum);
    }

    private static void longStreamMethod() {

        System.out.println("### longStreamMethod ###");
        LongStream stream = LongStream.of(5, 10, 7, 5, 10);
        OptionalDouble optional = stream.average();
        optional.ifPresent(System.out::println); //
        if (optional.isPresent()) {
            System.out.println(optional.getAsDouble());
            System.out.println(optional.orElseGet(() -> Double.NaN));
        }
    }

    private static void doubleStreamMethod() {

        System.out.println("### doubleStreamMethod ###");
        DoubleStream stream = DoubleStream.of(5.4, 10.2, 7.4, 5.7, 10);
        double sum = stream.sum();
        System.out.println(sum);
    }
}
