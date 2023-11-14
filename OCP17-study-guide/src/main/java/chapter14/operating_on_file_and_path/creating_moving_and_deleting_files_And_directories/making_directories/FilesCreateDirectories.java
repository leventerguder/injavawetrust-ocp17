package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesCreateDirectories {

    public static void main(String[] args) throws IOException {

        Files.createDirectories(Path.of("bison/field/pasture/green"));
        Files.createDirectories(Path.of("parent/child"));
        Files.createDirectories(Path.of("parent/child")); // No exception!
        // If all of the directories already exist, createDirectories() will simply complete without doing anything.
    }
}
