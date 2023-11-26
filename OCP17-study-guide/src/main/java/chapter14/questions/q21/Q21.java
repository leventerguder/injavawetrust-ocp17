package chapter14.questions.q21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Q21 {

    public static void main(String[] args) throws IOException {

        var f = Path.of("/monkeys");
        try (var m = Files.find(f, 0, (p, a) -> a.isSymbolicLink())) { // y1
            m.map(s -> s.toString())
                    .collect(Collectors.toList())
                    .stream()
                    .filter(s -> s.toString().endsWith(".txt")) // y2
                    .forEach(System.out::println);
        }
    }
}
