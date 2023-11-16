package chapter14.operating_on_file_and_path.comparing_files_with_isSameFile_and_mismatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesIsSameFile {

    public static void main(String[] args) throws IOException {

        Path p1 = Path.of("/non-exists/missing-file.xml");
        Path p2 = Path.of("/non-exists/missing-file.xml");

        //  If the two path objects are equal in terms of equals(),
        //  the method will just return true without checking whether the file exists
        System.out.println(p1.equals(p2));
        System.out.println(Files.isSameFile(p1, p2));
    }
}
