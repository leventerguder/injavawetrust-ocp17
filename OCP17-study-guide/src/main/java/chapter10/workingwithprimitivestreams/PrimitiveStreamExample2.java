package chapter10.workingwithprimitivestreams;

import java.util.stream.DoubleStream;

public class PrimitiveStreamExample2 {

    public static void main(String[] args) {

        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);
    }
}
