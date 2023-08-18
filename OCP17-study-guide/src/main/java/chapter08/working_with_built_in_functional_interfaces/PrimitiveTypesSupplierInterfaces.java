package chapter08.working_with_built_in_functional_interfaces;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class PrimitiveTypesSupplierInterfaces {

    public static void main(String[] args) {

        doubleSupplierExample();
        intSupplierExample();
        longSupplierExample();

    }

    private static void doubleSupplierExample() {

        System.out.println("### doubleSupplierExample ###");

        DoubleSupplier ds1 = () -> 10.0;
        DoubleSupplier ds2 = () -> Math.random();
        DoubleSupplier ds3 = Math::random;
        DoubleSupplier ds4 = () -> new Random().nextDouble();
        DoubleSupplier ds5 = PrimitiveSupplierHelper::randomDouble;
        Supplier<Double> s1 = Math::random;
        Supplier<Double> s2 = () -> Math.random();

        System.out.println(ds1.getAsDouble());
        System.out.println(ds2.getAsDouble());
        System.out.println(ds3.getAsDouble());
        System.out.println(ds4.getAsDouble());
        System.out.println(ds5.getAsDouble());
        System.out.println(s1.get());
        System.out.println(s2.get());
    }


    private static void intSupplierExample() {
        IntSupplier is1 = () -> 10;
        IntSupplier is2 = () -> (int) Math.random();
        IntSupplier is3 = () -> new Random().nextInt();
        IntSupplier is4 = PrimitiveSupplierHelper::randomInt;
        Supplier<Integer> s1 = PrimitiveSupplierHelper::randomInt;

        System.out.println(is1.getAsInt());
        System.out.println(is2.getAsInt());
        System.out.println(is3.getAsInt());
        System.out.println(is4.getAsInt());
        System.out.println(s1.get());
    }

    private static void longSupplierExample() {
        LongSupplier ls1 = () -> 10;
        LongSupplier ls2 = new Random()::nextInt;
        LongSupplier ls3 = new Random()::nextLong;
        LongSupplier ls4 = PrimitiveSupplierHelper::randomInt;
        LongSupplier ls5 = PrimitiveSupplierHelper::randomLong;

        // Supplier<Long> s1 = PrimitiveSupplierHelper::randomInt; // DOES NOT COMPILE
        Supplier<Long> s2 = PrimitiveSupplierHelper::randomLong;

        System.out.println(ls1.getAsLong());
        System.out.println(ls2.getAsLong());
        System.out.println(ls3.getAsLong());
        System.out.println(ls4.getAsLong());
        System.out.println(ls5.getAsLong());
        System.out.println(s2.get());
    }

}


class PrimitiveSupplierHelper {

    static double randomDouble() {
        Random random = new Random();
        return random.nextDouble();
    }

    static int randomInt() {
        Random random = new Random();
        return random.nextInt();
    }

    static long randomLong() {
        Random random = new Random();
        return random.nextLong();
    }
}