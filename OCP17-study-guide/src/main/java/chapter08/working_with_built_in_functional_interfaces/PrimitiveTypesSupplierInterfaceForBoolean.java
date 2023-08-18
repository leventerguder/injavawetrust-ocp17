package chapter08.working_with_built_in_functional_interfaces;

import java.util.Random;
import java.util.function.BooleanSupplier;

public class PrimitiveTypesSupplierInterfaceForBoolean {

    public static void main(String[] args) {

        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        BooleanSupplier b3 = PrimitiveBooleanHelper::isRandomNumGreaterThan5;

        String str = "not-empty";
        BooleanSupplier b4 = str::isEmpty;

        System.out.println(b1.getAsBoolean());
        System.out.println(b2.getAsBoolean());
        System.out.println(b3.getAsBoolean());
        System.out.println(b4.getAsBoolean());

    }
}

class PrimitiveBooleanHelper {

    static boolean isRandomNumGreaterThan5() {
        return new Random().nextInt(10) > 5;
    }
}