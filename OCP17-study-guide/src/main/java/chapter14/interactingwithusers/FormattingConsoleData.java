package chapter14.interactingwithusers;

import java.io.Console;

public class FormattingConsoleData {

    public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.format("It has %d animals and employs %d people", 391, 25);
            console.writer().println();
            console.printf("The zoo spans %5.1f acres", 128.91);
        }

    }
}
