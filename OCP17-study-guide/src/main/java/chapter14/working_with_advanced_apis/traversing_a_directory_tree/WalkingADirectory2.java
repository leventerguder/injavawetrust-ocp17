package chapter14.working_with_advanced_apis.traversing_a_directory_tree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WalkingADirectory2 {

    public static void main(String[] args) throws IOException {

        try (Stream<Path> streamPath = Files.walk(Path.of("extras/chapter14"))) {
            streamPath.forEach(System.out::println);
        }

    }

}
