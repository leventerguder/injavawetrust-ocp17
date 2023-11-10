package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesCreateDirectories {

    public static void main(String[] args) throws IOException {

        Files.createDirectory(Path.of("bison"));
        Files.createDirectory(Path.of("bison/field"));
        Files.createDirectories(Path.of("bison/field/pasture/green"));

    }
}
