package chapter14.questions.q04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q04 {


//    public void removeBadFile(Path path) {
//        if (Files.isDirectory(path))
//            System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
//    }

    // Files.deleteIfExists() declares the checked IOException that must be handled or declared.
    public void removeBadFile(Path path) throws IOException {
        if (Files.isDirectory(path))
            System.out.println(Files.deleteIfExists(path) ? "Success" : "Try Again");
    }
}
