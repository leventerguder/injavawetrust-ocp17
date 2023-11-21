package chapter14.interacting_with_users;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosingSystemStreams {

    public static void main(String[] args) throws IOException {

        try (var out = System.out) {
        }
        System.out.println("Hello");

        // It prints nothing. The methods of PrintStream do not throw any checked exceptions and rely on the checkError()
        //to report errors, so they fail silently.

        try (var err = System.err) {
        }
        System.err.println("Hello");
    }
}
