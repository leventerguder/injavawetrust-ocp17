package chapter14.questions.q10;

import java.nio.file.FileSystems;
import java.nio.file.Path;

public class Q10 {

//    Which of the following correctly create Path instances? (Choose all that apply.)

//  A. new Path("jaguar.txt")
//+++  B. FileSystems.getDefault().getPath("puma.txt")
//  C. Path.get("cats","lynx.txt")
//+++  D. new java.io.File("tiger.txt").toPath() E. new FileSystem().getPath("lion")
//  F. Paths.getPath("ocelot.txt")
//+++  G. Path.of(Path.of(".").toUri())

    public static void main(String[] args) {

        Path path = FileSystems.getDefault().getPath("puma.txt");

        Path path2 = new java.io.File("tiger.txt").toPath();

        Path path3 = Path.of(Path.of(".").toUri());
    }
}
