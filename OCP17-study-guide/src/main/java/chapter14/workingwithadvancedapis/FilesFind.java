package chapter14.workingwithadvancedapis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesFind {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(".");
        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                        && p.toString().endsWith(".java")
                        && a.size() > minSize)) {
            s.forEach(System.out::println);
        }
    }
}
