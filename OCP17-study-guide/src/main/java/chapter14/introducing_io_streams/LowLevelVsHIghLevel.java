package chapter14.introducing_io_streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LowLevelVsHIghLevel {

    public static void main(String[] args) throws IOException {

        try (var br = new BufferedReader(new FileReader("extras/chapter14/zoo.txt"))) {
            System.out.println(br.readLine());
        }
    }
}
