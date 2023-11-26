package chapter14.referencing_files_and_directories.creating_a_file_or_path;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ObtainingAPathFromFileSystem {

    public static void main(String[] args) {

        Path zooPath1 = FileSystems.getDefault().getPath("/home/tiger/data/stripes.txt");
        Path zooPath2 = FileSystems.getDefault().getPath("/home", "tiger", "data", "stripes.txt");

        FileSystem fileSystem = FileSystems.getDefault();
        System.out.println(fileSystem.getClass());
    }
}
