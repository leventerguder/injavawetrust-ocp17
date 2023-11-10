package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.viewing_the_path;

import java.nio.file.Path;

public class PathGetNameAndGetNameCount2 {

    public static void main(String[] args) {

        var p = Path.of("/");
        System.out.print(p.getNameCount()); // 0
        System.out.print(p.getName(0)); // IllegalArgumentException

        // Notice that if you try to call getName() with an invalid index,
        // it will throw an exception at runtime.

    }
}
