package chapter14.workingwithadvancedapis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckingFileAccessibility {

    public static void main(String[] args) throws IOException {

        System.out.print(Files.isHidden(Paths.get("/walrus.txt")));
        System.out.print(Files.isReadable(Paths.get("/seal/baby.png")));
        System.out.print(Files.isWritable(Paths.get("dolphin.txt")));
        System.out.print(Files.isExecutable(Paths.get("whale.png")));
    }
}
