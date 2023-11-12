package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.normalizing_a_path;

import java.nio.file.Path;

public class PathNormalize3 {

    public static void main(String[] args) {

        var p1 = Path.of("./dir");
        var p2 = Path.of("../dir");
        var p3 = Path.of("parent/../dir");
        var p4 = Path.of("../parent/../dir");

        System.out.println(p1.normalize());
        System.out.println(p2.normalize());
        System.out.println(p3.normalize());
        System.out.println(p4.normalize());
    }
}
