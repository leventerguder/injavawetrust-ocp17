package chapter14.reading_and_writing_files.using_io_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class UsingIOStreamsExample9PrintStream {

    public static void main(String[] args) throws IOException {

        try (PrintStream printStream = new PrintStream(new FileOutputStream("extras/chapter14/output.txt"))) {
            printStream.println(2023);
            printStream.println("line1");
            printStream.println("line2");
        }
    }

}
