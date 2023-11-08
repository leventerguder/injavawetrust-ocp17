package chapter14.interacting_with_users;

import java.io.Console;
import java.util.Arrays;

public class ReviewingConsoleMethods {

    public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            String name = console.readLine("Please enter your name: ");
            console.writer().format("Hi %s", name);
            console.writer().println();
            console.format("What is your address? ");
            String address = console.readLine();
            char[] password = console.readPassword("Enter a password " + "between %d and %d characters: ", 5, 10);
            char[] verify = console.readPassword("Enter the password again: ");
            console.printf("Passwords "
                    + (Arrays.equals(password, verify) ? "match" : "do not match"));
        }
    }
}
