package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.DoubleFunction;

public class FunctionForPrimitiveTypes {

    public static void main(String[] args) {

        DoubleFunction<String> df1 = Double::toHexString;
        DoubleFunction<String> df2 = (d) -> Double.toHexString(d);


    }
}
