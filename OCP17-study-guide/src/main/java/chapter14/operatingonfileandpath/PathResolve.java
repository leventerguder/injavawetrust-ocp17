package chapter14.operatingonfileandpath;

import java.nio.file.Path;

public class PathResolve {

    public static void main(String[] args) {

        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2));

        Path path3 = Path.of("/turkey/food");
        System.out.println(path3.resolve("/tiger/cage"));

    }
}
