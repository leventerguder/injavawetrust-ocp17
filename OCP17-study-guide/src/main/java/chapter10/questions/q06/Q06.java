package chapter10.questions.q06;

import java.util.stream.Stream;

public class Q06 {

    public static void main(String[] args) {

        optionA();

        // optionB();

        // optionE();
    }

    private static void optionA() {
        var s = Stream.generate(() -> "meow");
        var match = s.allMatch(String::isEmpty); //false
        System.out.println(match);
    }

    private static void optionB() {
        var s = Stream.generate(() -> "meow");
        var match = s.anyMatch(String::isEmpty); //hangs
        System.out.println(match);
    }

//    private static void optionC() {
//        var s = Stream.generate(() -> "meow");
//        // var match = s.findAny(String::isEmpty); //DOES NOT COMPILE
//        System.out.println(match);
//    }

//    private static void optionD() {
//        var s = Stream.generate(() -> "meow");
//        var match = s.findFirst(String::isEmpty); //DOES NOT COMPILE
//        System.out.println(match);
//    }

    private static void optionE() {
        var s = Stream.generate(() -> "meow");
        var match = s.noneMatch(String::isEmpty); //hangs
        System.out.println(match);
    }

}
