package chapter14.questions.q09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Q09 {

    public static void main(String[] args) throws Exception {

        File file1 = new File("file1.txt");
        FileWriter fw = new FileWriter(file1);
        fw.write("ABCDEFGHIJKLMNOPRSTUVYZ");
        fw.close();

        File file2 = new File("file2.txt");

        copyFile(file1, file2);
       // copyFile2(file1, file2);
    }


    public static void copyFile(File file1, File file2) throws Exception {
        var reader = new InputStreamReader(new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[10];
            while (reader.read(buffer) != -1) {
                writer.write(buffer);
            }
        }
    }

    public static void copyFile2(File file1, File file2) throws Exception {
        var reader = new InputStreamReader(new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[10];

            int lengthRead;
            while ((lengthRead = reader.read(buffer)) > 0) {
                writer.write(buffer, 0, lengthRead);
            }
        }
    }

    // This implementation is not correct, though, as the return value of read(buffer) is not used properly.
    // It will only correctly copy files whose character count is a multiple of 10,
}