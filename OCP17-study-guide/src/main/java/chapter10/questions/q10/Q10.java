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


//        Only one of the method calls, forEach(), is a terminal operation, so any answer in
//        which M is not the last line will not execute the pipeline

        optionA();
        optionB();
        optionC();

        // optionE(); // hangs!

        optionF();
        optionG();
    }

    private static void optionA() {

        System.out.println("### optionA ###");
        Stream.generate(() -> "1")
                .filter(x -> x.length() > 1)
                .limit(10);

    }

    private static void optionB() {

        System.out.println("### optionB ###");
        Stream.generate(() -> "1")
                .filter(x -> x.length() > 1)
                .limit(10)
                .peek(System.out::println);

    }

    private static void optionC() {

        System.out.println("### optionC ###");
        Stream.generate(() -> "1")
                .limit(10)
                .filter(x -> x.length() > 1)
                .forEach(System.out::println);

    }

    private static void optionD() {
        System.out.println("### optionD ###");
//        Stream.generate(() -> "1")
//                .limit(10)
//                .filter(x -> x.length() > 1)
//                .forEach(System.out::println)
//                .peek(System.out::println); //DOES NOT COMPILE
    }

    // Hangs!
    private static void optionE() {
        System.out.println("### optionE ###");
        Stream.generate(() -> "1")
                .filter(x -> x.length() > 1)
                .peek(System.out::println)
                .forEach(System.out::println);

    }

    private static void optionF() {
        System.out.println("### optionF ###");
        Stream.generate(() -> "1")
                .limit(10)
                .forEach(System.out::println);

    }

    private static void optionG() {
        System.out.println("### optionG ###");
        Stream.generate(() -> "1")
                .limit(10)
                .peek(System.out::println);

    }


}
