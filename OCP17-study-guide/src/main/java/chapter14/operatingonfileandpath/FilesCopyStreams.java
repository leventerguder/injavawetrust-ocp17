package chapter14.operatingonfileandpath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesCopyStreams {

    public static void main(String[] args) throws IOException {

        try (var is = new FileInputStream("extras/chapter14/source-data.txt")) { // Write I/O stream data to a file
            Files.copy(is, Paths.get("extras/chapter14/wolf.txt"));
        }

        Files.copy(Paths.get("extras/chapter14/clown.txt"), System.out);
    }
}
