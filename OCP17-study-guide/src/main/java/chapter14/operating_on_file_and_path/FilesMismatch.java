package chapter14.operating_on_file_and_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.mismatch(Path.of("extras/chapter14/animals/monkey.txt"),
                Path.of("extras/chapter14/animals/wolf.txt")));

        System.out.println(Files.mismatch(Path.of("extras/chapter14/animals/wolf.txt"),
                Path.of("extras/chapter14/animals/monkey.txt")));

        // The method returns -1 if the files are the same; otherwise, it returns the index of the first position in the file that differs.
    }
}
