package chapter08.questions.q05;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Q05 {

    public static void main(String[] args) {

        BooleanSupplier bs1 = () -> true;
        IntSupplier is1 = () -> 10;
        LongSupplier ls1 = () -> 10;
        DoubleSupplier ds1 = () -> 10;
    }
}
