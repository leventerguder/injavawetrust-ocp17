package chapter14.working_with_advanced_apis.traversing_a_directory_tree;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WalkingADirectory {

    public static void main(String[] args) throws IOException {

        WalkingADirectory directory = new WalkingADirectory();
        var size = directory.getPathSize(Path.of("."));
        System.out.format("Total Size: %.2f megabytes", (size / 1000000.0));
    }

    private long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(this::getSize)
                    .sum();
        }
    }
}
