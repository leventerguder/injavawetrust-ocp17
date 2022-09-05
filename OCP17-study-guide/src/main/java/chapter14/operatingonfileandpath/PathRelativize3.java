package chapter14.operatingonfileandpath;

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
