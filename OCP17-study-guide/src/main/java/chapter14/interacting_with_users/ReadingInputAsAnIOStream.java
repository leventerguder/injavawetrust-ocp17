package chapter14.interacting_with_users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInputAsAnIOStream {

    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Print your message: ");
        String userInput = reader.readLine();
        System.out.println("You entered: " + userInput);
    }
}
