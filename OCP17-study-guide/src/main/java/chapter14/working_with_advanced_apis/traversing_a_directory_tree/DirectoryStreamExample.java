package chapter14.working_with_advanced_apis.traversing_a_directory_tree;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample {

    public static void main(String[] args) throws IOException {

        var dirName = Paths.get("extras/chapter14");

        try (DirectoryStream<Path> paths = Files.newDirectoryStream(dirName)) {

            paths.forEach(System.out::println);
        }
    }
}
