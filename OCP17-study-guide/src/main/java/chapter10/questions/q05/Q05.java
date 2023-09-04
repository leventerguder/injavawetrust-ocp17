package chapter10.questions.q05;

import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Q05 {

    public static void main(String[] args) {

//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));


        methodC();

//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> (int) x)
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

//        double result = LongStream.of(6L, 8L, 10L)
//                .mapToInt(x -> x)
//                .boxed()
//                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
//                .keySet()
//                .stream()
//                .collect(Collectors.averagingInt(x -> x));

        methodF();
    }

    private static void methodC() {
        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);
    }

    private static void methodF() {
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
