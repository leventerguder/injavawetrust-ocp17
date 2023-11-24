package chapter14.working_with_advanced_apis.discovering_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class RetrievingAttributes {

    public static void main(String[] args) throws IOException {

        var path = Paths.get("extras/chapter14/turtles/sea.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());
        System.out.println("Last modified: " + data.creationTime());



        PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println("Owner : " + posixFileAttributes.owner());
    }
}
