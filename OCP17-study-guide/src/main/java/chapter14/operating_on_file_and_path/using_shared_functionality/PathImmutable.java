package chapter14.operating_on_file_and_path.using_shared_functionality;

import java.nio.file.Path;

public class PathImmutable {

    public static void main(String[] args) {

        Path p = Path.of("whale");
        p.resolve("krill");
        // Path instances are immutable!
        System.out.println(p); // whale

    }
}
