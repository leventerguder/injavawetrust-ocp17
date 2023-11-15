package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.copying_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCopyIntoADirectoryBad {

    public static void main(String[] args) throws IOException {

        var file = Paths.get("extras/chapter14/food.txt");
        var directory = Paths.get("extras/chapter14/enclosure2"); // java.nio.file.FileAlreadyExistsException
        Files.copy(file, directory);

    }
}
