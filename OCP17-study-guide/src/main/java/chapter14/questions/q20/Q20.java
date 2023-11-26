package chapter14.questions.q20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q20 {

    public static void main(String[] args) throws IOException {

        Files.move(Path.of("monkey.txt"), Paths.get("/animals"), StandardCopyOption.ATOMIC_MOVE, LinkOption.NOFOLLOW_LINKS);
    }
}
