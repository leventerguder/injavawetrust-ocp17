package chapter14.questions.q12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class Q12 {

    public static void main(String[] args) throws IOException {

        var p = Paths.get("sloth.schedule");
        var a = Files.readAttributes(p, BasicFileAttributes.class);
        // Files.mkdir(p.resolve(".backup")); // DOES NOT COMPILE
        if (a.size() > 0 && a.isDirectory()) {
        //    a.setTimes(null, null, null); // DOES NOT COMPILE
        }


    }
}
