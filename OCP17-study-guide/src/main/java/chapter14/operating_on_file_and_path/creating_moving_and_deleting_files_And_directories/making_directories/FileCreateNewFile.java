package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.File;
import java.io.IOException;

public class FileCreateNewFile {

    public static void main(String[] args) {

        File file = new File("sample-file.txt");

        System.out.println(file.exists());

        try {
            boolean created = file.createNewFile();

            System.out.println(created);
            System.out.println(file.exists());
        } catch (IOException e) {
           e.printStackTrace();
        }

    }
}
