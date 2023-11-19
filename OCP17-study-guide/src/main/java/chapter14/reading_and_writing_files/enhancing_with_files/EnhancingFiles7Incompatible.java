package chapter14.reading_and_writing_files.enhancing_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EnhancingFiles7Incompatible {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/log-data.txt");

        // DOES NOT COMPILE
//        Files.readAllLines(input).
//                filter(s -> s.length() > 2)
//                .forEach(System.out::println);

        // The readAllLines() method returns a List, not a Stream,
        // so the filter() method is not available.


        Files.readAllLines(input).
                stream().
                filter(s -> s.length() > 2)
                .forEach(System.out::println);
    }


}
