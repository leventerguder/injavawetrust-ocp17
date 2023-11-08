package chapter14.referencing_files_and_directories;

import java.io.File;

public class CreatingAFile {

    public static void main(String[] args) {

        File zooFile1 = new File("/home/tiger/data/stripes.txt");
        File zooFile2 = new File("/home/tiger", "data/stripes.txt");

        File parent = new File("/home/tiger");
        File zooFile3 = new File(parent, "data/stripes.txt");

        System.out.println(zooFile1.exists());

    }
}
