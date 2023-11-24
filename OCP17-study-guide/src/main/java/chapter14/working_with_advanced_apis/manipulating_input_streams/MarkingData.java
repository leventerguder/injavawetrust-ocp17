package chapter14.working_with_advanced_apis.manipulating_input_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkingData {

    public static void main(String[] args) throws IOException {
        var fis = new FileInputStream("extras/chapter14/lion-data.txt");
        readData(fis);

        System.out.println();
        var buffered = new BufferedInputStream(new FileInputStream("extras/chapter14/lion-data.txt"));
        readData(buffered);
    }

    public static void readData(InputStream is) throws IOException {
        System.out.print((char) is.read()); // L
        if (is.markSupported()) {
            is.mark(100); // Marks up to 100 bytes
            System.out.print((char) is.read()); // I
            System.out.print((char) is.read()); // O
            is.reset(); // Resets stream to position before I
        }

        System.out.print((char) is.read()); // I
        System.out.print((char) is.read()); // O
        System.out.print((char) is.read());  // N
    }


}
