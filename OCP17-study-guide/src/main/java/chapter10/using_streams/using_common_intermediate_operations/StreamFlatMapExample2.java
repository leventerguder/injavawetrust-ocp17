package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;

public class StreamFlatMapExample2 {

    public static void main(String[] args) {

        gibberish();

        flatMapExample();
    }

    private static void gibberish() {
        String[] string = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string)
                .map(word -> word.split(""))
                .distinct()
                .forEach(System.out::print);

        // the word.split() returns a String[] and distinct() removes duplicate references.
        // Since the elements in the stream are of type String[],
        // the forEach() prints calls the default toString() implementation
        // that prints something that is not human-readable.
    }

    private static void flatMapExample() {
        System.out.println();
        String[] string = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::print);
    }
}
