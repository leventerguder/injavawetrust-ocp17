package chapter14.interacting_with_users;

import java.io.Console;
import java.io.PrintWriter;

public class ReadingConsoleData {

    public static void main(String[] args) {

        Console console = System.console();

        if (console != null) {
            PrintWriter pw = console.writer();

            pw.println("Console Example");

            pw.println("Username : ");

            String username = console.readLine();

            pw.println("Password : ");
            char[] password = console.readPassword();

            pw.println("The user :" + username);
            pw.println("Password length : " + password.length);
        }
    }
}
