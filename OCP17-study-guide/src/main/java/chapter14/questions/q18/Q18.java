package chapter14.questions.q18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Q18 {

    public static void main(String[] args) throws IOException {

        //InputStream reader = new FileInputStream("extras/chapter14/peacock.txt");

        BufferedInputStream reader = new BufferedInputStream(new FileInputStream("extras/chapter14/peacock.txt"));

        var sb = new StringBuilder();
        sb.append((char) reader.read()); // P
        reader.mark(10);
        for (int i = 0; i < 2; i++) {
            sb.append((char) reader.read()); // 1 -> E // 2 ->O
            reader.skip(2); // 1 -> A C ignored. // 2 -> C K ignored
        }
        reader.reset();
        reader.skip(0);

        sb.append((char) reader.read()); // E
//        sb.append((char) reader.read()); // A
//        sb.append((char) reader.read()); // C
//        sb.append((char) reader.read()); // O
//        sb.append((char) reader.read()); // C
//        sb.append((char) reader.read()); // K
//        sb.append((char) reader.read()); // S
        System.out.println(sb.toString());
    }
}
