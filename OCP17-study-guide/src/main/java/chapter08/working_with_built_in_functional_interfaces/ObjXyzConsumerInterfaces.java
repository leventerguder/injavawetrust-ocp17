package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class ObjXyzConsumerInterfaces {

    public static void main(String[] args) {

        objDoubleConsumerExample();
        objIntConsumerExample();
        objLongConsumerExample();
    }

    private static void objDoubleConsumerExample() {
        ObjDoubleConsumer<String> odc1 = (String str, double d) -> System.out.println(Double.parseDouble(str) + d);
        odc1.accept("100.5", 20);
    }

    private static void objIntConsumerExample() {
        ObjIntConsumer<String> odc1 = (String str, int d) -> System.out.println(Double.parseDouble(str) + d);
        odc1.accept("100.5", 20);
    }

    private static void objLongConsumerExample() {
        ObjLongConsumer<String> odc1 = (String str, long d) -> System.out.println(Double.parseDouble(str) + d);
        odc1.accept("100.5", 20);
    }
}
