package chapter11.automatingresourcemanagement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ApplyingEffectivelyFinal3 {

    public static void main(String[] args) throws IOException {

        var writer = Files.newBufferedWriter(Path.of("test.txt"));
        writer.append("This write is permitted but a really bad idea!");
        try (writer) {
            writer.append("Welcome to the zoo!");
        }
        writer.append("This write will fail!"); // IOException

    }
}
