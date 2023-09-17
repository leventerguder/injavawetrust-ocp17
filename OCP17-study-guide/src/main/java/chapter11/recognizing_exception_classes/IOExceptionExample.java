package chapter11.recognizing_exception_classes;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionExample {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("file.txt");
        fileWriter.close();

        fileWriter.write("sample"); //  java.io.IOException: Stream closed
    }
}
