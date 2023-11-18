package chapter14.reading_and_writing_files.using_io_streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class UsingIOStreamsExample9LineSeparator {

    public static void main(String[] args) throws IOException {

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();

    }

}
