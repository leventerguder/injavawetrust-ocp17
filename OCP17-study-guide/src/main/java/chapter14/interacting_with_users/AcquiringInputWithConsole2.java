package chapter14.interacting_with_users;

import java.io.Console;

public class AcquiringInputWithConsole2 {

    public static void main(String[] args) {

        Console console = System.console();
        if (console != null) {
            console.writer().println("Writer Message!");
        } else {
            System.err.println("Console not available");
        }

    }
}
