package chapter14.operating_on_file_and_path.creating_moving_and_deleting_files_And_directories.deleting_a_file_with_delete_and_deleteIfExists;

import java.io.File;
import java.io.IOException;

public class FileDelete {

    public static void main(String[] args) throws IOException {

        File file = new File("delete-me.xml");
        System.out.println("file.createNewFile : " + file.createNewFile());

        System.out.println("file.delete : " + file.delete());
        System.out.println("file.delete : " + file.delete());
        
    }
}
