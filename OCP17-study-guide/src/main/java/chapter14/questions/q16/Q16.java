package chapter14.questions.q16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q16 {

    // Assuming zoo-data.txt exists and is not empty, what statements about the following
    // method are correct?
    private void echo() throws IOException {
        var o = new FileWriter("new-zoo.txt");
        try (var f = new FileReader("zoo-data.txt");
             var b = new BufferedReader(f); o) {
            o.write(b.readLine());
        }
        o.write("");
    }
}
