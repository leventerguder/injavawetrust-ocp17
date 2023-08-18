package chapter08.working_with_built_in_functional_interfaces;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class ToXyzBiFunctionInterfaces {

    public static void main(String[] args) {

        toDoubleBiFunctionExample();
        toIntBiFunctionExample();
        toLongBiFunctionExample();

    }

    private static void toDoubleBiFunctionExample() {

        System.out.println("### toDoubleBiFunctionExample ###");

        ToDoubleBiFunction<Integer, Integer> tdbf1 = (i, j) -> i + j;
        ToDoubleBiFunction<Integer, Integer> tdbf2 = (Integer i, Integer j) -> (i + j) * 5.2;
        ToDoubleBiFunction<Double, Double> tdbf3 = (var d1, var d2) -> Double.max(d1, d2);
        ToDoubleBiFunction<Double, Double> tdbf4 = Double::min;

        System.out.println(tdbf1.applyAsDouble(15, 20));
        System.out.println(tdbf2.applyAsDouble(15, 20));
        System.out.println(tdbf3.applyAsDouble(15.0, 20.0));
        System.out.println(tdbf4.applyAsDouble(15.0, 20.0));
    }

    private static void toIntBiFunctionExample() {

        System.out.println("### toIntBiFunctionExample ###");

        ToIntBiFunction<Integer, Integer> tibf1 = (i, j) -> i + j;
        ToIntBiFunction<Integer, Integer> tibf2 = Integer::max;
        ToIntBiFunction<Integer, Integer> tibf3 = Integer::compareTo;
        ToIntBiFunction<String, String> tibf4 = (str1, str2) -> str1.length() + str2.length();

        System.out.println(tibf1.applyAsInt(10, 20));
        System.out.println(tibf2.applyAsInt(10, 20));
        System.out.println(tibf3.applyAsInt(10, 20));
        System.out.println(tibf4.applyAsInt("content1", "content2"));
    }


    private static void toLongBiFunctionExample() {

        System.out.println("### toLongBiFunctionExample ###");
        ToLongBiFunction<String, String> tlbf1 = (var str1, var str2) -> str1.length() + str2.length();
        ToLongBiFunction<Long, Long> tlbf2 = Math::max;
        ToLongBiFunction<Integer, Integer> tlbf3 = Math::max;
        ToLongBiFunction<Long, Long> tlbf4 = Long::max;

        System.out.println(tlbf1.applyAsLong("key", "value"));
        System.out.println(tlbf2.applyAsLong(100L, 2000L));
        System.out.println(tlbf3.applyAsLong(100, 2000));
        System.out.println(tlbf4.applyAsLong(100L, 2000L));
    }
}
