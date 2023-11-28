package chapter14.questions.q24;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q24 {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("sounds-created.txt");
        pw.println("line1");
        pw.println("line2");
        pw.close();

        copyIntoFlipDirectory(Path.of("sounds-created.txt"));
    }

    static void copyIntoFlipDirectory(Path source) throws IOException {
        var dolphinDir = Path.of("extras/chapter14/flip");
        dolphinDir = Files.createDirectories(dolphinDir);
        var n = Paths.get("sounds.txt");
        Files.copy(source, dolphinDir.resolve(n), StandardCopyOption.REPLACE_EXISTING);
    }
}
