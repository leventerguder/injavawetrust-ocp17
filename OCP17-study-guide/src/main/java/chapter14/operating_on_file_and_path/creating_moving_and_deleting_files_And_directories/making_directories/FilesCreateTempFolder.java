package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesCreateTempFolder {

    public static void main(String[] args) throws IOException {

        Path tempDirectory = Files.createTempDirectory("temp-directory-");

        System.out.println("TempDirectory path: " + tempDirectory.toAbsolutePath());

        Path tempDirectory2 = Files.createTempDirectory(Path.of("extras/chapter14"), "temp-directory2-");

        System.out.println("TempDirectory2 path: " + tempDirectory2.toAbsolutePath());


        System.out.println(Files.deleteIfExists(tempDirectory));
        System.out.println(Files.deleteIfExists(tempDirectory2));
    }
}
