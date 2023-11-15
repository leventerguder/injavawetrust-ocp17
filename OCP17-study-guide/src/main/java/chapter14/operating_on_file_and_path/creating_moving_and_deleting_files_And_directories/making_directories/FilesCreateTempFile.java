package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesCreateTempFile {

    public static void main(String[] args) throws IOException {

        Path tempFile = Files.createTempFile("tmp", null);

        System.out.println("File path: " + tempFile.toAbsolutePath());

        Path tempFile2 = Files.createTempFile(Path.of("extras/chapter14"), "tmp", ".txt");

        System.out.println("File path: " + tempFile2.toAbsolutePath());

        System.out.println(Files.deleteIfExists(tempFile));
        System.out.println(Files.deleteIfExists(tempFile2));

    }
}
