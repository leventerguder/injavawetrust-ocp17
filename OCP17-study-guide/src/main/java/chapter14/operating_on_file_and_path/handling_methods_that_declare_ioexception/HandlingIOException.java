package chapter14.operating_on_file_and_path.handling_methods_that_declare_ioexception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HandlingIOException {

    public static void main(String[] args) {

        var path = Path.of("extras/chapter14/text-folder/missing-file.txt");

        try {
            Files.getLastModifiedTime(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
