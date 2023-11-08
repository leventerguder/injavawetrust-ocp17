package chapter14.referencing_files_and_directories.creating_a_file_or_path;

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
