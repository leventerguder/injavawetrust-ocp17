package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.moving_or_renaming_paths_with_move;

import java.io.File;
import java.io.IOException;

public class FileRenameTo {

    public static void main(String[] args) throws IOException {

        File file = new File("extras/chapter14/sample-file.xml");
        System.out.println("file.createNewFile : " + file.createNewFile());

        File fileRenameTo = new File("extras/chapter14/sample-file-renamed.xml");
        System.out.println("file.renameTo : " + file.renameTo(fileRenameTo));
    }
}
