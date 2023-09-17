package chapter11.understanding_exceptions;

public class ThrowingAnException3 {

    private static void watchOutNewKeyword() {
        // throw RuntimeException(); // DOES NOT COMPILE
        throw new RuntimeException(); //
    }
}
