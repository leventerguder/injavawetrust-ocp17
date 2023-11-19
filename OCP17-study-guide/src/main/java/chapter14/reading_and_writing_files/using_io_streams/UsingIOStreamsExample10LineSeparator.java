package chapter14.reading_and_writing_files.using_io_streams;

import java.io.IOException;

public class UsingIOStreamsExample10LineSeparator {

    public static void main(String[] args) throws IOException {

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator();

    }

}
