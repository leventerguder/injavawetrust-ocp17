package chapter14.reading_and_writing_files.enhancing_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EnhancingFiles1ReadString {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/content-data.txt");
        Path output = Path.of("extras/chapter14/content-data-out.txt");

        copyPathAsString(input, output);
    }

    private static void copyPathAsString(Path input, Path output) throws IOException {
        String string = Files.readString(input);
        System.out.println("---- Content -----");
        System.out.println(string);
        Files.writeString(output, string);
    }

}
