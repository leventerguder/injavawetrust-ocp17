package chapter14.referencing_files_and_directories.creating_a_file_or_path;

import java.io.File;
import java.nio.file.Path;

public class SwitchingBetweenFileAndPath {

    public static void main(String[] args) {

        File file = new File("rabbit");
        Path nowPath = file.toPath();
        File backToFile = nowPath.toFile();

    }
}
