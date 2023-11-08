package chapter14.working_with_advanced_apis;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckingForSymbolicLinks {

    public static void main(String[] args) {

        System.out.print(Files.isDirectory(Paths.get("/canine/fur.jpg")));
        System.out.print(Files.isSymbolicLink(Paths.get("/canine/coyote")));
        System.out.print(Files.isRegularFile(Paths.get("/canine/types.txt")));
    }
}
