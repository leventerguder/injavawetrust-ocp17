package chapter14.operatingonfileandpath;

import java.io.File;

public class FileOperations {

    public static void main(String[] args) {

        var file = new File("text-folder/zoo.txt");
        var file2 = new File("text-folder");
        io(file);
        io(file2);
    }

    private static void io(File file) {
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {

                for (File subfile : file.listFiles()) {
                    System.out.println(" " + subfile.getName());
                }
            }
        }
    }
}