package chapter14.reading_and_writing_files.enhancing_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EnhancingFiles6ReadAllLinesVsLines {

    public static void main(String[] args) throws IOException {

        Path input = Path.of("extras/chapter14/log-data.txt");

        System.out.println("---- readAllLines -----");
        Files.readAllLines(input).forEach(System.out::println);

        System.out.println("---- lines -----");
        Files.lines(input).forEach(System.out::println);

        /*
        The first line reads the entire file into memory and performs a print operation on the result,
        while the second line lazily processes each line and prints it as it is read.

        The advantage of the second code snippet is that it does not require
        the entire file to be stored in memory at any time.
         */
    }


}
