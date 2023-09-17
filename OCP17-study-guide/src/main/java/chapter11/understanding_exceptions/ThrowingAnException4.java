package chapter11.understanding_exceptions;

public class ThrowingAnException4 {

    private static void unreachableStatement() {

        try {
            throw new RuntimeException();
            // throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE
        } catch (Exception e) {
        }
    }

}
