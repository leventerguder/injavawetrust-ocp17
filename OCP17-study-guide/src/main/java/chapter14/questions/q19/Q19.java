package chapter14.questions.q19;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q19 {

    public static void main(String[] args) throws IOException {

        var p1 = Path.of("extras/chapter14/lizard", ".").resolve(Path.of("walking.txt"));
        var p2 = new File("extras/chapter14/lizard/././actions/../walking.txt").toPath();

        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.normalize());
        System.out.println(p1.normalize());

        System.out.print(Files.isSameFile(p1, p2));
        System.out.print(" ");
        System.out.print(p1.equals(p2));
        System.out.print(" ");
        System.out.print(Files.mismatch(p1, p2));
    }
}
