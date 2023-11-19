package chapter14.reading_and_writing_files.using_io_streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UsingIOStreamsExample5BufferedInputStream {

    public static void main(String[] args) throws IOException {
        File fileSrc = new File("extras/chapter14/content-data.txt");
        File fileDest = new File("extras/chapter14/content-data-out.txt");
        copyTextFile(fileSrc, fileDest);
    }

    static void copyTextFile(File src, File dest) throws IOException {
        try (var bis = new BufferedInputStream(new FileInputStream(src), 8192); // 8192 default buffer size!
             var bos = new BufferedOutputStream(new FileOutputStream(dest), 8192)) {

            byte[] allBytes = bis.readAllBytes();

            String contents = new String(allBytes, StandardCharsets.UTF_8);
            System.out.println(contents);

            bos.write(allBytes);

        }
    }
}
