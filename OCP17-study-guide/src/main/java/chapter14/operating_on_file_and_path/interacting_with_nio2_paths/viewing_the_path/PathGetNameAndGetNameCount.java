package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.viewing_the_path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathGetNameAndGetNameCount {

    public static void main(String[] args) {

        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i = 0; i < path.getNameCount(); i++)
            System.out.println(" Element " + i + " is: " + path.getName(i));

    }
}
