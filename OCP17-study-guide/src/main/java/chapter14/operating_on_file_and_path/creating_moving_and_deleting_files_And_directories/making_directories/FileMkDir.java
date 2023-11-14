package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.File;
import java.io.IOException;

public class FileMkDir {

    public static void main(String[] args) {

        File folder = new File("mkdir-folder");

        System.out.println(folder.exists());

        boolean result = folder.mkdir();
        if (result) {

            File file = new File(folder, "dummy-file.xml");
            try {
                boolean fileResult = file.createNewFile();
                if (fileResult) {
                    System.out.println("File was created!");
                } else {
                    System.out.println("File was not created!");
                }
            } catch (IOException e) {
                System.err.println(e);
            }
        }


    }
}
