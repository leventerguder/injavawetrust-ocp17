package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.creating_part_of_the_path;

import java.nio.file.Paths;

public class PathSubPath {

    public static void main(String[] args) {

        var p = Paths.get("/mammal/omnivore/raccoon.image");
        System.out.println("Path is: " + p);
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " + p.getName(i));
        }

        System.out.println();
        System.out.println("subpath(0,3): " + p.subpath(0, 3));
        System.out.println("subpath(1,2): " + p.subpath(1, 2));
        System.out.println("subpath(1,3): " + p.subpath(1, 3));


        // Like getNameCount() and getName(), subpath() is zero-indexed and does not include the root. Also like getName(),
        // subpath() throws an exception if invalid indices are provided.

        // var q = p.subpath(0, 4); // IllegalArgumentException
        // var x = p.subpath(1, 1); // IllegalArgumentException

    }
}
