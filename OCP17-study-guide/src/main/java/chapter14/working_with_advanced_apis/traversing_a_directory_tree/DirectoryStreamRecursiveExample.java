package chapter14.working_with_advanced_apis.traversing_a_directory_tree;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirectoryStreamRecursiveExample {

    private static final List<Path> paths = new ArrayList<>();

    private static List<Path> walk(Path path) throws IOException {

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {

            for (Path entry : stream) {
                if (Files.isDirectory(entry)) {
                    walk(entry);
                }
                paths.add(entry);
            }
        }

        return paths;
    }

    public static void main(String[] args) throws IOException {

        var myPath = Paths.get("extras/chapter14");

        var paths = walk(myPath);

        paths.forEach(System.out::println);
    }
}
