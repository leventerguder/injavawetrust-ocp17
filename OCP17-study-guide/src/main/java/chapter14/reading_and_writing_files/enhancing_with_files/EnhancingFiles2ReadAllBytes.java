package chapter14.reading_and_writing_files.enhancing_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EnhancingFiles2ReadAllBytes {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/content-data.txt");
        Path output = Path.of("extras/chapter14/content-data-out.txt");

        copyPathAsBytes(input, output);
    }

    private static void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        System.out.println("---- Content -----");
        for (byte b : bytes) {
            System.out.print((char) b);
        }
        Files.write(output, bytes);
    }


}
