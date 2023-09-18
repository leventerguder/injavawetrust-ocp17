package chapter11.handling_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ApplyingAMultiCatchBlock3 {

    public static void main(String[] args) {

        // Java intends multi-catch to be used for exceptions that aren’t related,
        // and it prevents you from specifying redundant types in a multi-catch
//        try {
//            throw new IOException();
//        } catch (FileNotFoundException | IOException p) { // DOES NOT COMPILE
//        }

        try {
            throw new IOException();
        } catch (IOException p) {
        }

        try {

        } catch (NullPointerException | IllegalArgumentException | IndexOutOfBoundsException e) {

        }

//        try {
//
//        } catch (NumberFormatException | IllegalArgumentException e) { // DOES NOT COMPILE
//
//        }

    }
}
