package chapter14.reading_and_writing_files.using_io_streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class UsingIOStreamsExample2FileReader {

    public static void main(String[] args) throws IOException {
        var fileReader = new FileReader("extras/chapter14/source-data.txt");
        var fileWriter = new FileWriter("extras/chapter14/source-data-out.txt");
        copyStream(fileReader, fileWriter);
    }

    static void copyStream(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            System.out.print((char) b + " ");
            out.write(b);
        }
        out.close();
    }

}
