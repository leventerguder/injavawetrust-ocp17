package chapter14.questions.q11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Q11 {

    void method1() throws IOException {

        var is = new BufferedInputStream(new FileInputStream("z.txt"));
        InputStream wrapper = new BufferedInputStream(is);
        try (wrapper) {
        }
    }

    void method2() throws IOException {

        var is = new BufferedInputStream(new FileInputStream("z.txt"));
        InputStream wrapper = new ObjectInputStream(is);
        try (wrapper) {
        }
    }
}
