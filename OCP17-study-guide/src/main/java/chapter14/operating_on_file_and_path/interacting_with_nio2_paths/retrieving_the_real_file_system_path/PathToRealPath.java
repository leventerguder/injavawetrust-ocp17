package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.retrieving_the_real_file_system_path;

import java.io.IOException;
import java.nio.file.Paths;

public class PathToRealPath {

    public static void main(String[] args) throws IOException {

        System.out.println(Paths.get(".").toRealPath());

        System.out.println(Paths.get("extras/chapter14/zoo.txt").toRealPath());
        System.out.println(Paths.get("extras/chapter14/food.txt").toRealPath());

        // NoSuchFileException
        System.out.println(Paths.get("extras/chapter14/missing.txt").toRealPath());
    }
}
