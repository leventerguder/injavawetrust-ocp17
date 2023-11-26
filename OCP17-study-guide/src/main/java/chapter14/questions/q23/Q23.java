package chapter14.questions.q23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q23 {

    public static void main(String[] args) throws IOException {

        var x = Path.of("/animals/fluffy/..");
        Files.walk(x.toRealPath().getParent()) // u1
                .map(p -> p.toAbsolutePath().toString()) // u2
                .filter(s -> s.endsWith(".java"))
                .forEach(System.out::println);
    }
}
