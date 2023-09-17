package chapter10.questions.q09;

import java.util.stream.LongStream;

public class Q09 {

    public static void main(String[] args) {

        // optionA();
        optionB();
        // optionC();
        optionD();

    }

    private static void optionA() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();

//        if (opt.isPresent())
//            System.out.println(opt.get()); // DOES NOT COMPILE
    }

    private static void optionB() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();

        if (opt.isPresent())
            System.out.println(opt.getAsLong());
    }

    private static void optionC() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();

        // opt.ifPresent(System.out.println); // DOES NOT COMPILE
    }

    private static void optionD() {
        var stream = LongStream.of(1, 2, 3);
        var opt = stream.map(n -> n * 10)
                .filter(n -> n < 5).findFirst();

        opt.ifPresent(System.out::println);
    }
}
