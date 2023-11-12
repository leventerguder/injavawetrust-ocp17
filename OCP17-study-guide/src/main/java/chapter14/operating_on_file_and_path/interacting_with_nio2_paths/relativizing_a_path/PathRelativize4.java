package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.relativizing_a_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize4 {

    public static void main(String[] args) {

        // the following would also
        // throw an IllegalArgumentException on a Windows-based system:

        Path path3 = Paths.get("C:\\primate\\chimpanzee");
        Path path4 = Paths.get("D:\\storage\\bananas.txt");

        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));
    }
}
