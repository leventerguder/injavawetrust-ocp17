package chapter09.questions.q09;

import java.io.FileNotFoundException;

public class Helper {

    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {

        Helper.printException(new FileNotFoundException("A"));

        Helper.printException(new Exception("B"));

        // Helper.<Throwable>printException(new Exception("C")); // DOES NOT COMPILE

        Helper.<NullPointerException>printException(new NullPointerException("D"));

        // Helper.printException(new Throwable("E")); // DOES NOT COMPILE
    }
}
