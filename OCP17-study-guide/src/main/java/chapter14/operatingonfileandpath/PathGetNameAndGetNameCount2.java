package chapter14.operatingonfileandpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathGetNameAndGetNameCount2 {

    public static void main(String[] args) {

        var p = Path.of("/");
        System.out.print(p.getNameCount()); // 0
        System.out.print(p.getName(0)); // IllegalArgumentException

        // Notice that if you try to call getName() with an invalid index,
        // it will throw an exception at runtime.

    }
}
