package chapter14.operating_on_file_and_path.using_shared_functionality;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PathOperations {


    public static void main(String[] args) throws IOException {

        var path = Path.of("extras/chapter14/text-folder/text-folder/zoo.txt");
        var path2 = Path.of("extras/chapter14/text-folder/text-folder");
        nio(path);
        nio(path2);
    }

    public static void nio(Path path) throws IOException {

        if (Files.exists(path)) {
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Parent Path: " + path.getParent());

            if (Files.isRegularFile(path)) {
                System.out.println("Size: " + Files.size(path));
                System.out.println("Last Modified: " + Files.getLastModifiedTime(path));
            } else {
                try (Stream<Path> stream = Files.list(path)) {
                    stream.forEach(p -> System.out.println(" " + p.getName(0)));
                }
            }

        }

    }
}
