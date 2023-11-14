package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.making_directories;

import java.io.File;
import java.io.IOException;

public class FileMkDirs {

    public static void main(String[] args) {

        File folder = new File("parent/child");

        boolean mkDirResult = folder.mkdir();
        System.out.println(mkDirResult);


        boolean mkDirsResult = folder.mkdirs();
        System.out.println(mkDirsResult);
    }
}
