package chapter14.referencing_files_and_directories.creating_a_file_or_path;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingAPath {

    public static void main(String[] args) {

        Path zooPath1 = Path.of("/home/tiger/data/stripes.txt");
        Path zooPath2 = Path.of("/home", "tiger", "data", "stripes.txt");

        Path zooPath3 = Paths.get("/home/tiger/data/stripes.txt");
        Path zooPath4 = Paths.get("/home", "tiger", "data", "stripes.txt");

        System.out.println(Files.exists(zooPath1));
        System.out.println(zooPath1.getClass());
        System.out.println(zooPath2.getClass());
        System.out.println(zooPath3.getClass());
        System.out.println(zooPath4.getClass());
    }
}
