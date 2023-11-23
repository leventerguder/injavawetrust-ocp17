package chapter14.working_with_advanced_apis.discovering_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckingForSymbolicLinks {

    public static void main(String[] args) throws IOException {

        Path newLink = Paths.get("extras/chapter14/symbolic.txt");
        Path target = Path.of("extras/chapter14/attributes.txt");

        Files.createFile(target);

        Files.createSymbolicLink(newLink, target);

        System.out.println(Files.isDirectory(Paths.get("extras/chapter14")));
        System.out.println(Files.isSymbolicLink(Paths.get("extras/chapter14/symbolic.txt")));
        System.out.println(Files.isRegularFile(Paths.get("extras/chapter14/zoo.txt")));

        Files.deleteIfExists(newLink);
        Files.deleteIfExists(target);
    }
}
