package chapter14.operating_on_file_and_path.comparing_files_with_isSameFile_and_mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMismatch3 {

    public static void main(String[] args) throws IOException {

        System.out.println(Files.mismatch(Path.of("extras/chapter14/animals/bird.txt"),
                Path.of("extras/chapter14/animals/fish.txt")));
    }
}
