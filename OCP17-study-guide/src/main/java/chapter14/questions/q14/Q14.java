package chapter14.questions.q14;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Q14 {

    public static void main(String[] args) {

        var p1 = Path.of("/zoo/./bear", "../food.txt");
        p1.normalize().relativize(Path.of("/lion")); // ignored!
        System.out.println(p1); // /zoo/./bear/../food.txt
        var p2 = Paths.get("/zoo/animals/bear/koala/food.txt");
        System.out.println(p2.subpath(1, 3).getName(1));
        var p3 = Path.of("/pets/../cat.txt");
        var p4 = Paths.get("./dog.txt");
        System.out.println(p4.resolve(p3));
    }
}
