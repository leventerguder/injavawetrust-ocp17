package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.relativizing_a_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativize5 {

    public static void main(String[] args) {


        Path path1 = Paths.get("primate/chimpanzee.xml");
        Path path2 = Paths.get("storage/secret/bananas/chiquita");

        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
    }
}
