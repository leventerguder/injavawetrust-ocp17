package chapter14.working_with_advanced_apis.discovering_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CheckingFileAccessibility {

    public static void main(String[] args){

        try {
            System.out.println(Files.isHidden(Paths.get("extras/chapter14/walrus.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Files.isReadable(Paths.get("extras/chapter14/seal/baby.png")));
        System.out.println(Files.isWritable(Paths.get("extras/chapter14/dolphin.txt")));
        System.out.println(Files.isExecutable(Paths.get("extras/chapter14/whale.png")));
    }
}
