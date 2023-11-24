package chapter14.working_with_advanced_apis.traversing_a_directory_tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WalkingADirectory3 {

    public static void main(String[] args) throws IOException {

        System.out.println("maxDepth = 0 ");
        try (Stream<Path> streamPath = Files.walk(Path.of("extras/chapter14"), 0)) {
            streamPath.forEach(System.out::println);
        }

        System.out.println("maxDepth = 1 ");
        try (Stream<Path> streamPath = Files.walk(Path.of("extras/chapter14"), 1)) {
            streamPath.forEach(System.out::println);
        }

        //  java.lang.IllegalArgumentException: 'maxDepth' is negative
//        try (Stream<Path> streamPath = Files.walk(Path.of("extras/chapter14"), -1)) {
//            streamPath.forEach(System.out::println);
//        }

    }

}
