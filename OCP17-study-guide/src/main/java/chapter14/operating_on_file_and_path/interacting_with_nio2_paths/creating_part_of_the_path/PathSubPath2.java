package chapter14.operating_on_file_and_path.interacting_with_nio2_paths.creating_part_of_the_path;

import java.nio.file.Paths;

public class PathSubPath2 {

    public static void main(String[] args) {

        var p = Paths.get("/mammal/omnivore/raccoon.image");

         var q = p.subpath(0, 4); // IllegalArgumentException
         var x = p.subpath(1, 1); // IllegalArgumentException

        // Like getNameCount() and getName(), subpath() is zero-indexed and does not include the root.
        // Also like getName(), subpath() throws an exception if invalid indices are provided.

    }
}
