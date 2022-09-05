package chapter14.operatingonfileandpath;

import java.io.IOException;
import java.nio.file.Paths;

public class PathToRealPath {

    public static void main(String[] args) throws IOException {

        System.out.println(Paths.get(".").toRealPath());
    }
}
