package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.copying_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyReplaceExisting {

    public static void main(String[] args) throws IOException {

        Files.copy(Paths.get("extras/chapter14/book.txt"), Paths.get("extras/chapter14/movie.txt"), StandardCopyOption.REPLACE_EXISTING);
    }
}
