package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.resolving_paths;

import java.nio.file.Path;

public class PathResolve2 {

    public static void main(String[] args) {

        Path path1 = Path.of("cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));

    }
}
