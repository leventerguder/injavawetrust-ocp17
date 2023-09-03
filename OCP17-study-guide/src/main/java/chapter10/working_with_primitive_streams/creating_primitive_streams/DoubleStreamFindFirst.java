package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class DoubleStreamFindFirst {

    public static void main(String[] args) {

        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();
        System.out.println("First matching temperature > 0 is " + temperature.getAsDouble());

        // the "match" and "find" methods for searching elements are "short-circuiting" in nature.
    }
}
