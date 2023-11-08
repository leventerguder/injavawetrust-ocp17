package chapter14.operating_on_file_and_path;

import java.io.IOException;
import java.nio.file.Paths;

public class PathToRealPath {

    public static void main(String[] args) throws IOException {

        System.out.println(Paths.get(".").toRealPath());
    }
}
