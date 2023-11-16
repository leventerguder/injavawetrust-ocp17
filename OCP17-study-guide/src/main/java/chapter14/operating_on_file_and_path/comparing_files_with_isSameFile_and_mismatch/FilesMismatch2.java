package chapter14.operating_on_file_and_path.comparing_files_with_isSameFile_and_mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch2 {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.mismatch(Path.of("extras/chapter14/animals/cat.txt"),
                Path.of("extras/chapter14/animals/wolf.txt")));

        // The method returns -1 if the files are the same; otherwise,
        // it returns the index of the first position in the file that differs.
    }
}
