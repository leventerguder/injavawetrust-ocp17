package chapter11.automating_resource_management;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ApplyingEffectivelyFinal2 {

    public static void main(String[] args) throws IOException {

        var writer = Files.newBufferedWriter(Path.of("test.txt"));
//        try (writer) { // DOES NOT COMPILE
//            writer.append("Welcome to the zoo!");
//        }
        writer = null;

        // Since it is not an effectively final variable, it cannot be used in a try-with- resources statement
    }
}
