package chapter11.recognizing_exception_classes;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {

    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("not-found.txt");
    }
}
