package chapter14.referencingfilesanddirectories;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ObtainigAPathFromFileSystem {

    public static void main(String[] args) {

        Path zooPath1 = FileSystems.getDefault().getPath("/home/tiger/data/stripes.txt");
        Path zooPath2 = FileSystems.getDefault().getPath("/home", "tiger", "data", "stripes.txt");
    }
}
