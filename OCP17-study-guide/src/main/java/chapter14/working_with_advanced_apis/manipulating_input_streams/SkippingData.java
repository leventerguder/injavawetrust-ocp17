package chapter14.working_with_advanced_apis.manipulating_input_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SkippingData {

    public static void main(String[] args) throws IOException {

        var buffered = new BufferedInputStream(new FileInputStream("extras/chapter14/tigers-data.txt"));
        readData(buffered);
    }
    public static void readData(InputStream is) throws IOException {

        System.out.print((char) is.read()); // T
        is.skip(2); // Skips I and G
        is.read(); // Reads E but doesn't output it
        System.out.print((char) is.read()); // R
        System.out.print((char) is.read()); // S
    }
}
