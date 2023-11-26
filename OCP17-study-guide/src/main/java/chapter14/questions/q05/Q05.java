package chapter14.questions.q05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q05 {

    public static void main(String[] args) throws IOException {


    }

    void method() {

        // The filter() operation applied to a Stream<Path> takes only one parameter, not two.
        // So the code does not compile.

//        Path path = Path.of("/animals");
//        try (var z = Files.walk(path)) {
//            boolean b = z
//                    .filter((p, a) -> a.isDirectory() && !path.equals(p)) // x
//                    .findFirst().isPresent(); // y
//            System.out.print(b ? "No Sub" : "Has Sub");
    }


}
