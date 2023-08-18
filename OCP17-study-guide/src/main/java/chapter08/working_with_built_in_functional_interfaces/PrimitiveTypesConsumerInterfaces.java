package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class PrimitiveTypesConsumerInterfaces {

    public static void main(String[] args) {

        doubleConsumerExample();
        intConsumerExample();
        longConsumerExample();

    }

    private static void doubleConsumerExample() {

        System.out.println("### doubleConsumerExample ###");

        DoubleConsumer dc1 = (value) -> System.out.println(value);
        DoubleConsumer dc2 = System.out::println;
        DoubleConsumer dc3 = PrimitiveConsumerHelper::consumeDouble;

        Consumer<Double> c1 = (value) -> System.out.println(value);
        Consumer<Double> c2 = System.out::println;
        Consumer<Double> c3 = PrimitiveConsumerHelper::consumeDouble;

        dc1.accept(10);
        dc2.accept(10);
        dc3.accept(10);
        c1.accept(10d);
        c2.accept(10D);
        c3.accept(10.0);
    }

    private static void intConsumerExample() {

        System.out.println("### intConsumerExample ###");

        IntConsumer ic1 = value -> System.out.println(value);
        IntConsumer ic2 = System.out::println;
        IntConsumer ic3 = PrimitiveConsumerHelper::consumeDouble;
        IntConsumer ic4 = PrimitiveConsumerHelper::consumeInt;

        Consumer<Integer> c1 = (value) -> System.out.println(value);
        Consumer<Integer> c2 = System.out::println;
        Consumer<Integer> c3 = PrimitiveConsumerHelper::consumeDouble;
        Consumer<Integer> c4 = PrimitiveConsumerHelper::consumeInt;

        ic1.accept(10);
        ic2.accept(10);
        ic3.accept(10);
        ic4.accept(10);

        c1.accept(10);
        c2.accept(10);
        c3.accept(10);
        c4.accept(10);

    }


    private static void longConsumerExample() {

        System.out.println("### longConsumerExample ###");

        LongConsumer lc1 = (value) -> System.out.println(value);
        LongConsumer lc2 = System.out::println;
        // LongConsumer lc3 = PrimitiveConsumerHelper::consumeInt; // DOES  NOT COMPILE
        LongConsumer lc4 = PrimitiveConsumerHelper::consumeLong;
        LongConsumer lc5 = PrimitiveConsumerHelper::consumeDouble;

        Consumer<Long> c1 = (value) -> System.out.println(value);
        Consumer<Long> c2 = System.out::println;
        // Consumer<Long> c3 = PrimitiveConsumerHelper::consumeInt; // DOES NOT COMPILE
        Consumer<Long> c4 = PrimitiveConsumerHelper::consumeLong;
        Consumer<Long> c5 = PrimitiveConsumerHelper::consumeDouble;

        lc1.accept(1);
        lc2.accept(1);
        lc4.accept(1);
        lc5.accept(1);

        c1.accept(1L);
        c2.accept(1L);
        c4.accept(1L);
        c5.accept(1L);
    }

}

class PrimitiveConsumerHelper {

    static void consumeDouble(double d) {
        System.out.println(d * 2);
    }

    static void consumeInt(int d) {
        System.out.println(d * 2);
    }

    static void consumeLong(long l) {
        System.out.println(l * 2);
    }
}