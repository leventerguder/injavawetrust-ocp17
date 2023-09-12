package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.stream.DoubleStream;

public class PrimitiveStreamExample2 {

    public static void main(String[] args) {


        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);

        System.out.println("### DoubleStream.generate ###");
        random.limit(3).forEach(System.out::println);

        System.out.println("### DoubleStream.iterate ###");
        fractions.limit(3).forEach(System.out::println);
    }
}
