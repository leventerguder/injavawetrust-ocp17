package chapter14.workingwithadvancedapis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class RetrievingAttributes {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("extras/chapter14/turtles/sea.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (inbytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());
    }
}
