package chapter14.referencingfilesanddirectories;

import java.io.File;
import java.nio.file.Path;

public class SwitchingBetweenFileAndPath {

    public static void main(String[] args) {

        File file = new File("rabbit");
        Path nowPath = file.toPath();
        File backToFile = nowPath.toFile();

    }
}
