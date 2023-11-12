package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.resolving_paths;

import java.nio.file.Path;

public class PathResolve {

    public static void main(String[] args) {

        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2));
        System.out.println(path2.resolve(path1));

        Path path3 = Path.of("/turkey/food");
        Path path4 = Path.of("/tiger/cage");
        System.out.println(path3.resolve(path4));
        System.out.println(path4.resolve(path3));

    }
}
