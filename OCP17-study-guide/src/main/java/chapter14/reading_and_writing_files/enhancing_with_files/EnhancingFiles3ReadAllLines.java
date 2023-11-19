package chapter14.reading_and_writing_files.enhancing_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EnhancingFiles3ReadAllLines {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/content-data.txt");
        Path output = Path.of("extras/chapter14/content-data-out.txt");

        copyPathAsLines(input, output);
    }

    private static void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        System.out.println("---- Content -----");
        lines.forEach(System.out::println);
        Files.write(output, lines);
    }


}
