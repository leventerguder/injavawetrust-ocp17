package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.File;
import java.io.IOException;

public class FileCreateTempFile {

    public static void main(String[] args) throws IOException {

        File tempFile1 = File.createTempFile("tmp", ".txt", new File("extras/chapter14"));

        System.out.println("File path: " + tempFile1.getAbsolutePath());

        File tempFile2 = File.createTempFile("tmp", null, new File("extras/chapter14"));

        System.out.println("File path: " + tempFile2.getAbsolutePath());

        System.out.println(tempFile1.delete());
        System.out.println(tempFile2.delete());

    }
}
