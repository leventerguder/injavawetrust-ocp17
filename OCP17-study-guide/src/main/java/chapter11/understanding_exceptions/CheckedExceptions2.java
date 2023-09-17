package chapter11.understanding_exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptions2 {

    public static void main(String[] args) throws IOException {
        method();
    }

    static void method() throws IOException {
        FileWriter fileWriter = new FileWriter("sample-txt");
        fileWriter.write("sample-content");
    }

    static void methodV2() {
        try {
            method();
        } catch (IOException e) {
            // log
        }
    }
}
