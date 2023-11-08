package chapter14.operating_on_file_and_path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMove {

    public static void main(String[] args) throws IOException {

        Files.move(Path.of("extras/chapter14/zoo.txt"), Path.of("extras/chapter14/zoo-new.txt"));

        Files.move(Path.of("extras/chapter14/user/addresses.txt"), Path.of("extras/chapter14/user-new/addresses.txt"));
    }
}
