package chapter14.working_with_advanced_apis.manipulating_input_streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SkippingData2 {

    public static void main(String[] args) throws IOException {

        var buffered = new BufferedInputStream(new FileInputStream("extras/chapter14/tigers-data.txt"));
        readData(buffered);
    }

    public static void readData(InputStream is) throws IOException {

        System.out.println((char) is.read()); // T
        long result = is.skip(100);
        System.out.print((char) is.read());
        System.out.print((char) is.read());

        System.out.println("skipped size : " + result);
    }
}
