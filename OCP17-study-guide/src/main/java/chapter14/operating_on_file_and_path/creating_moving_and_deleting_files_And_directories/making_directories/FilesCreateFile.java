package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCreateFile {

    public static void main(String[] args) throws IOException {

        Files.createFile(Path.of("my-file"));
        Files.createFile(Paths.get("my-second-file.properties"));
        Files.createFile(Paths.get("my-third-file.xml"));

        Files.createDirectory(Paths.get("my-folder"));
        Files.createFile(Path.of("my-folder", "text-file.txt"));
    }
}
