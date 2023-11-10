package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.copying_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCopy {

    public static void main(String[] args) throws IOException {

        Files.copy(Paths.get("extras/chapter14/panda/bamboo.txt"), Paths.get("extras/chapter14/panda-save/bamboo.txt"));

        Files.copy(Paths.get("extras/chapter14/turtle"), Paths.get("extras/chapter14/turtleCopy"));
    }
}
