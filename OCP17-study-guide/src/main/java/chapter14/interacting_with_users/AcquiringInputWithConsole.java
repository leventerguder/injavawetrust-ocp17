package chapter14.interacting_with_users;

import java.io.Console;

public class AcquiringInputWithConsole {

    public static void main(String[] args) {

        // Console c = new Console(); // DOES NOT COMPILE

        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("Console not available");
        }

    }
}
