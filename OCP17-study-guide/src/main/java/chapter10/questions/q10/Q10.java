package chapter10.questions.q10;

import java.util.stream.Stream;

public class Q10 {

    public static void main(String[] args) {
//
//        Stream.generate(() -> "1")
//                .filter(x -> x.length() > 1)
//                .forEach(System.out::println)
//                .limit(10)
//                .peek(System.out::println)
//        ;

        optionA();
        optionB();
        optionC();

        // optionE(); // hangs!

        optionF();
        optionG();
    }

    private static void optionA() {
        Stream.generate(() -> "1")
                .filter(x -> x.length() > 1)
                .limit(10);

    }

    private static void optionB() {
        Stream.generate(() -> "1")
                .filter(x -> x.length() > 1)
                .limit(10)
                .peek(System.out::println);

    }

    private static void optionC() {
        Stream.generate(() -> "1")
                .limit(10)
                .filter(x -> x.length() > 1)
                .forEach(System.out::println);

    }

    private static void optionD() {
//        Stream.generate(() -> "1")
//                .limit(10)
//                .filter(x -> x.length() > 1)
//                .forEach(System.out::println)
//                .peek(System.out::println); //DOES NOT COMPILE
    }

    // Hangs!
//    private static void optionE() {
//        Stream.generate(() -> "1")
//                .filter(x -> x.length() > 1)
//                .peek(System.out::println)
//                .forEach(System.out::println);
//
//    }

    private static void optionF() {
        Stream.generate(() -> "1")
                .limit(10)
                .forEach(System.out::println);

    }

    private static void optionG() {
        Stream.generate(() -> "1")
                .limit(10)
                .peek(System.out::println);

    }


}
