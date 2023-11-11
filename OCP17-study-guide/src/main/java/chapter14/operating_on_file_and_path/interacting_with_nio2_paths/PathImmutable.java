package chapter14.operating_on_file_and_path.interacting_with_nio2_paths;

import java.nio.file.Path;

public class PathImmutable {

    public static void main(String[] args) {

        Path p = Path.of("whale");
        p.resolve("krill");
        // Path instances are immutable!
        System.out.println(p); // whale

    }
}
