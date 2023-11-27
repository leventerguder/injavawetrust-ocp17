package chapter14.questions.q08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Q08 {

//    void printData(Path path) throws IOException {
//        Files.readAllLines(path) // r1
//                .flatMap(p -> Stream.of(p.split(","))) // r2  // DOES NOT COMPILE
//                .map(q -> q.toUpperCase()) // r3
//                .forEach(System.out::println);
//    }


// The readAllLines() method returns a List, not a Stream.

    public static void main(String[] args) throws IOException {
        printData2(Path.of("extras/chapter14/fox/food-schedule.csv"));
    }

    static void printData2(Path path) throws IOException {
        Files.readAllLines(path) // r1
                .stream()
                .flatMap(p -> Stream.of(p.split(","))) // r2  // DOES NOT COMPILE
                .map(q -> q.toUpperCase()) // r3
                .forEach(System.out::println);
    }
}
