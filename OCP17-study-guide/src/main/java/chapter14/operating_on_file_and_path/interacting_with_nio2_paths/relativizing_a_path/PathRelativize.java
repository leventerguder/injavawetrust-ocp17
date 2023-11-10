package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.relativizing_a_path;

import java.nio.file.Path;

public class PathRelativize {

    public static void main(String[] args) {

        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
