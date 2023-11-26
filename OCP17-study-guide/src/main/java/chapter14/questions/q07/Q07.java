package chapter14.questions.q07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q07 {

    // Assume that /kang exists as a symbolic link to the directory /mammal/kangaroo within the file system.
    // Which of the following statements are correct about this code snippet?
    // (Choose all that apply.)


    public static void main(String[] args) throws IOException {

        var path = Paths.get("/kang");
        if (Files.isDirectory(path) && Files.isSymbolicLink(path))
            Files.createDirectory(path.resolve("joey"));
    }
    // The code snippet will attempt to create a directory if the target of the symbolic link exists and is a directory.
    // If the directory already exists, though, it will throw an exception.
}
