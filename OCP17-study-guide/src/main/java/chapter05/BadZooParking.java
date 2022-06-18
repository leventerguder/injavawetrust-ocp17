package chapter05;

// import static java.util.Arrays; // DOES NOT COMPILE
// Remember that static imports are only for importing static members like a method or variable.

import static java.util.Arrays.asList;

// static import java.util.Arrays.*; // DOES NOT COMPILE
// Tries to see whether you are paying attention to the order of keywords.The syntax is import static and not vice versa.

public class BadZooParking {

    public static void main(String[] args) {
        //Arrays.asList("one"); // DOES NOT COMPILE
        asList("one");

        // The asList method is imported. However, the Arrays class is not imported anywhere.
        // This makes it okay to write asList("one") but not Arrays.asList("one").
    }
}




