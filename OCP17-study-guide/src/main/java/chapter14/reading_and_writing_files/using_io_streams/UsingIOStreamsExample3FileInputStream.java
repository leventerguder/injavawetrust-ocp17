package chapter14.reading_and_writing_files.using_io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UsingIOStreamsExample3FileInputStream {

    public static void main(String[] args) throws IOException {
        var fileInputStream = new FileInputStream("extras/chapter14/source-data.txt");
        var fileOutputStream = new FileOutputStream("extras/chapter14/source-data-out.txt");
        copyStream(fileInputStream, fileOutputStream);
    }

    static void copyStream(InputStream in, OutputStream out) throws IOException {
        int batchSize = 1024;
        var buffer = new byte[batchSize];
        int lengthRead;
        while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {
            System.out.println("lengthRead : " + lengthRead);
            out.write(buffer, 0, lengthRead);
            out.flush();
        }
    }
}
