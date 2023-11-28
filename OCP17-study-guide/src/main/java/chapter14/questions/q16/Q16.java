package chapter14.questions.q16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Q16 {

    // Assuming zoo-data.txt exists and is not empty, what statements about the following
    // method are correct?

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("zoo-data.txt");
        pw.println("line1");
        pw.println("line2");
        pw.println("line3");
        pw.println("line4");
        pw.close();

        echo();
    }
    private static void echo() throws IOException {
        var o = new FileWriter("new-zoo.txt");
        try (var f = new FileReader("zoo-data.txt");
             var b = new BufferedReader(f); o) {
            o.write(b.readLine());
        }
        o.write(""); // IOException : Stream closed
    }
}
