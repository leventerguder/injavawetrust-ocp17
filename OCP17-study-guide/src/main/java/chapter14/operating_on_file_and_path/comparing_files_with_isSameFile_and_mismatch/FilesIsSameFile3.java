package chapter14.operating_on_file_and_path.comparing_files_with_isSameFile_and_mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesIsSameFile3 {

    public static void main(String[] args) throws IOException {

        Path path1 = Paths.get("extras/chapter14/animals/monkey/ears.png");
        Path path2 = Paths.get("extras/chapter14/animals/wolf/ears.png");


        System.out.println(Files.isSameFile(path1, path2));
    }
}