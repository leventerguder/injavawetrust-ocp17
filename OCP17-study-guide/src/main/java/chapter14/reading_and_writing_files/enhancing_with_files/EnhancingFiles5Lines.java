package chapter14.reading_and_writing_files.enhancing_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class EnhancingFiles5Lines {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/log-data.txt");

        readLazily(input);
    }

    private static void readLazily(Path path) throws IOException {
        System.out.println("---- Content -----");
        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN:"))
                    .map(f -> f.substring(5))
                    .forEach(System.out::println);
        }
    }


}
