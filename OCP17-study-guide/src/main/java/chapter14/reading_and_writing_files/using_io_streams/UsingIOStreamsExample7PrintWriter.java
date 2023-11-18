package chapter14.reading_and_writing_files.using_io_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UsingIOStreamsExample7PrintWriter {

    public static void main(String[] args) throws IOException {
        File fileSrc = new File("extras/chapter14/content-data.txt");
        File fileDest = new File("extras/chapter14/content-data-out.txt");
        copyTextFile(fileSrc, fileDest);
    }

    static void copyTextFile(File src, File dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src));
             var writer = new PrintWriter(new FileWriter(dest))) {
            String line = null;
            while ((line = reader.readLine()) != null)
                writer.println(line);
        }
    }
}
