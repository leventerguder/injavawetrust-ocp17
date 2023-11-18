package chapter14.introducing_io_streams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LowLevelVsHIghLevel2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try (var ois = new ObjectInputStream(new BufferedInputStream(
                new FileInputStream("extras/chapter14/zoo.txt")))) {
            System.out.print(ois.readObject());
        }

    }
}
