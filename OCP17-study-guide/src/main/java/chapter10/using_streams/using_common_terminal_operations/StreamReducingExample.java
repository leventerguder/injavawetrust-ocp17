package chapter10.using_streams.using_common_terminal_operations;

import chapter05.overloading_methods.SystemOut;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamReducingExample {

    public static void main(String[] args) {

        reduceMethod1();

        reduceMethod2();

        reduceMethod3();

        reduceMethod4();

        reduceMethod5();

        reduceMethod6();

        reduceMethod7();

        reduceMethod8();

        reduceMethod9();

        reduceMethod10();

        reduceMethod11();

    }

    private static void reduceMethod1() {
        System.out.println("### reduceMethod1 ###");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf
    }

    private static void reduceMethod2() {
        System.out.println("### reduceMethod2 ###");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("---", String::concat);
        System.out.println(word); // ---wolf
    }

    private static void reduceMethod3() {
        System.out.println("### reduceMethod3 ###");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Optional<String> word = stream.reduce(String::concat);
        System.out.println(word); // Optional[wolf]
    }

    private static void reduceMethod4() {
        System.out.println("### reduceMethod4 ###");
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, (a, b) -> a * b)); // 90
    }

    private static void reduceMethod5() {
        System.out.println("### reduceMethod5 ###");
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(2, (a, b) ->

                {
                    System.out.println("a : " + a + " , b : " + b);
                    return a * b;
                }
        )); // 180
    }


    private static void reduceMethod6() {
        System.out.println("### reduceMethod6 ###");
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce((a, b) -> a * b)); // Optional[90]
    }

    private static void reduceMethod7() {
        System.out.println("### reduceMethod7 ###");
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println);            // no output
        oneElement.reduce(op).ifPresent(System.out::println);       // 3
        threeElements.reduce(op).ifPresent(System.out::println);    // 90
    }

    private static void reduceMethod8() {
        System.out.println("### reduceMethod8 ###");
        Stream<String> stream = Stream.of("w", "o", "l", "f!");
        int length = stream.reduce(0, (i, s) -> i + s.length(), (a, b) -> a + b);
        System.out.println(length); // 5
    }

    private static void reduceMethod9() {
        System.out.println("### reduceMethod9 ###");
        Stream<String> stream = Stream.of("ab", "abc", "abcd", "abcde");
        int length = stream.reduce(0, (i, s) -> i + s.length(), (Integer a, Integer b) -> a + b);
        System.out.println(length); // 14
    }

    private static void reduceMethod10() {
        System.out.println("### reduceMethod10 ###");
        Stream<String> stream = Stream.of("ab", "abc", "abcd", "abcde");
        int length = stream.reduce(0, (Integer i, String s) ->
                {
                    System.out.println(i + "-" + s);
                    return i + s.length();
                },
                (Integer a, Integer b) ->
                {
                    System.out.println("not used! Not a parallel stream!");
                    System.out.println(a + "-" + b);
                    return a + b;
                }
        );
        System.out.println(length); // 14
    }

    private static void reduceMethod11() {
        System.out.println("### reduceMethod11 ###");
        Stream<String> stream = List.of("ab", "abc", "abcd", "abcde").parallelStream();
        int length = stream.reduce(0, (Integer i, String s) ->
                {
                    System.out.println(i + "-" + s);
                    return i + s.length();
                },
                (Integer a, Integer b) ->
                {
                    System.out.println("Combiner : " + a + "-" + b);
                    return a + b;
                }
        );
        System.out.println(length); // 14
    }

}
