package chapter14.operatingonfileandpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCopyIntoADirectory {

    public static void main(String[] args) throws IOException {

        var file = Paths.get("extras/chapter14/food.txt");
        var directory = Paths.get("extras/chapter14/enclosure/food.txt");
        Files.copy(file, directory);
    }
}
