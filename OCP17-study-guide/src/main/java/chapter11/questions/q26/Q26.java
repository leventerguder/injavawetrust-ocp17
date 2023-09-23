package chapter11.questions.q26;

import java.io.IOException;

public class Q26 {

    void rollOut() throws ClassCastException {
    }

//    public void transformA(String c) {
//        try {
//            rollOut();
//        } catch (IllegalArgumentException | IOException a) { // DOES NOT COMPILE
//        }
//        // Exception 'java.io.IOException' is never thrown in the corresponding try bloc
//    }

    public void transformB(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | Error b) {
        }
        // Exception 'java.io.IOException' is never thrown in the corresponding try bloc
    }

//    public void transformC(String c) {
//        try {
//            rollOut();
//        } catch (IllegalArgumentException | NullPointerException c) { // DOES NOT COMPILE
//        }
//        // Variable 'c' is already defined in the scope
//    }

//    public void transformD(String c) {
//        try {
//            rollOut();
//        } catch (IllegalArgumentException | RuntimeException d) {
//        }
//
//        // s in multi-catch must be disjoint: 'java.lang.IllegalArgumentException'
//        is a subclass of 'java.lang.RuntimeException
//    }

//    public void transformE(String c) {
//        try {
//            rollOut();
//        } catch (IllegalArgumentException | NumberFormatException f) {
//        }
//    }

    // Types in multi-catch must be disjoint: 'java.lang.NumberFormatException'
    // is a subclass of 'java.lang.IllegalArgumentException

    public void transformF(String c) {
        try {
            rollOut();
        } catch (IllegalArgumentException | ClassCastException f) {
        }
    }
}
