package chapter10.questions.q05;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Q05 {

    public static void main(String[] args) {

        optionA();
        optionB();
        optionC();
        optionD();
        optionE();
        optionF();

        //  B and E are incorrect because they do not cast the long to an int, resulting in
        //  a compiler error on the mapToInt() calls

        // Options A and D are incorrect because they are missing
        // boxed() before the collect() call.
    }

    private static void optionA() {
//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x)) // DOES NOT COMPILE
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
    }


    private static void optionB() {
//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x) // DOES NOT COMPILE
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
    }


    private static void optionC() {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);
    }

    private static void optionD() {
//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet())) // DOES NOT COMPILE
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
    }

    private static void optionE() {
//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x) // DOES NOT COMPILE
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));
    }

    private static void optionF() {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);
    }

}
