package chapter10.usingstreams;

import java.util.stream.Stream;

public class StreamIteratingExample {

    public static void main(String[] args) {
        streamForEach();

        streamForLoop();
    }

    private static void streamForEach() {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo
    }


    private static void streamForLoop() {
        Stream<Integer> s = Stream.of(1);
        //for (Integer i : s) {} // DOES NOT COMPILE
    }

}
