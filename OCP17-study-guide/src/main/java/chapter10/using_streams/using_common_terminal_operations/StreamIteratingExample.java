package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

import java.util.List;

public class StreamIteratingExample {

    public static void main(String[] args) {
        streamForEach();

        collectionForEach();

        streamForLoop();
    }

    private static void streamForEach() {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo
        System.out.println();
    }

    /*
    Remember that you can call forEach() directly on a Collection or on a Stream.
    Don’t get confused on the exam when you see both approaches.
     */
    private static void collectionForEach() {
        List<String> list = List.of("Monkey", "Gorilla", "Bonobo");
        list.forEach(System.out::print); // MonkeyGorillaBonobo
        System.out.println();
    }


    /*
    Notice that you can’t use a traditional for loop on a stream!
     */
    private static void streamForLoop() {
        Stream<Integer> s = Stream.of(1);
        //for (Integer i : s) {} // DOES NOT COMPILE
    }

}
