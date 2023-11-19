package chapter14.reading_and_writing_files.using_io_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class UsingIOStreamsExample1FileInputStream {

    public static void main(String[] args) throws IOException {
        var fileInputStream = new FileInputStream("extras/chapter14/source-data.txt");
        var fileOutputStream = new FileOutputStream("extras/chapter14/source-data-out.txt");
        copyStream(fileInputStream, fileOutputStream);
    }

    static void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            System.out.print((char) b + " ");
            out.write(b);
        }
        out.close();
    }

}
