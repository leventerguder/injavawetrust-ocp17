package chapter14.operating_on_file_and_path.comparing_files_with_isSameFile_and_mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesIsSameFile2 {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("extras/chapter14");
        final Path p2 = Paths.get("extras/../extras/chapter14");

        System.out.println(p1.equals(p2));
        System.out.println(Files.isSameFile(p1, p2));
    }
}
