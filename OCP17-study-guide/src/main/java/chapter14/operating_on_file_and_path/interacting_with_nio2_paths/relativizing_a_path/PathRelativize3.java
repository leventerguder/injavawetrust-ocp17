package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.relativizing_a_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize3 {

    public static void main(String[] args) {

        // The relativize() method requires both paths to be absolute
        // or relative and throws an exception if the types are mixed.

        Path path1 = Paths.get("/primate/chimpanzee");
        Path path2 = Paths.get("bananas.txt");
        path1.relativize(path2); // IllegalArgumentException
    }
}
