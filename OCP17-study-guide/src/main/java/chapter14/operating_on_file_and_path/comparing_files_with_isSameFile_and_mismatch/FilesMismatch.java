package chapter14.operating_on_file_and_path.comparing_files_with_isSameFile_and_mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.mismatch(Path.of("extras/chapter14/animals/monkey.txt"),
                Path.of("extras/chapter14/animals/wolf.txt")));

        System.out.println(Files.mismatch(Path.of("extras/chapter14/animals/wolf.txt"),
                Path.of("extras/chapter14/animals/monkey.txt")));

        // The method returns -1 if the files are the same; otherwise,
        // it returns the index of the first position in the file that differs.

        // The mismatch() method is symmetric and returns the same result
        // regardless of the order of the parameters
    }
}
