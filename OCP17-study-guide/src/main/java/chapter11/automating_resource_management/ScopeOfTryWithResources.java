package chapter11.automating_resource_management;

import java.util.Scanner;

public class ScopeOfTryWithResources {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            s.nextLine();
        } catch (Exception e) {
            // s.nextInt(); // DOES NOT COMPILE
        } finally {
            // s.nextInt(); // DOES NOT COMPILE
        }

        // The problem is that Scanner has gone out of scope at the end of the try clause
    }
}
