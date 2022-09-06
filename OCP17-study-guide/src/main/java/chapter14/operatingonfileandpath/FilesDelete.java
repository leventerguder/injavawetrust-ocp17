package chapter14.operatingonfileandpath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDelete {

    public static void main(String[] args) throws IOException {

        Files.delete(Paths.get("extras/chapter14/vulture/feathers.txt"));
        Files.deleteIfExists(Paths.get("extras/chapter14/pigeon"));

    }
}
