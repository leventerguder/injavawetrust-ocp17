package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.deleting_a_file_with_delete_and_deleteIfExists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDelete3 {

    public static void main(String[] args) throws IOException {

        Files.delete(Paths.get("extras/chapter14/vulture/missing.txt"));
        // java.nio.file.NoSuchFileException

    }
}
