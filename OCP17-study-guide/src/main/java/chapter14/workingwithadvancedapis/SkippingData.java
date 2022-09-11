package chapter14.workingwithadvancedapis;

import java.io.IOException;
import java.io.InputStream;

public class SkippingData {

    public void readData(InputStream is) throws IOException {

        System.out.print((char) is.read()); // T
        is.skip(2); // Skips I and G
        is.read(); // Reads E but doesn't output it
        System.out.print((char) is.read()); // R
        System.out.print((char) is.read()); // S
    }
}
