package chapter14.interacting_with_users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingSystemStreams2 {

    public static void main(String[] args) throws IOException {

        var reader = new BufferedReader(new InputStreamReader(System.in));
        try (reader) {
        }
        String data = reader.readLine(); // IOException
    }
}
