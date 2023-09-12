package chapter10.working_with_primitive_streams.using_optional_with_primitive_streams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class OptionalPrimitiveExample3 {

    public static OptionalDouble selectHighestTemperature(DoubleStream temperatures) {
        return temperatures.max();
    }

    public static OptionalDouble selectLowestTemperature(DoubleStream temperatures) {
        return temperatures.min();
    }

    public static void main(String[] args) {

        OptionalDouble highest = selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
        OptionalDouble lowest = selectLowestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
        OptionalDouble empty = selectHighestTemperature(DoubleStream.of());

        System.out.println(highest);
        System.out.println(lowest);
        System.out.println(empty);
    }
}
