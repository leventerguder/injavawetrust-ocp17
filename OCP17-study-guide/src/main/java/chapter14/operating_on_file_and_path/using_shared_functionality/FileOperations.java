package chapter14.operating_on_file_and_path.using_shared_functionality;

import java.io.File;

public class FileOperations {

    public static void main(String[] args) {

        var file = new File("extras/chapter14/text-folder/zoo.txt");
        var file2 = new File("extras/chapter14/text-folder");
        io(file);
        io(file2);
    }

    private static void io(File file) {
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File : " + file.isFile());
            System.out.println("Is Absolute Path: " + file.isAbsolute());
            System.out.println("Is Hidden : " + file.isHidden());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {

                for (File subfile : file.listFiles()) {
                    System.out.println(" " + subfile.getName());
                }
            }
            System.out.println();
        }
    }
}