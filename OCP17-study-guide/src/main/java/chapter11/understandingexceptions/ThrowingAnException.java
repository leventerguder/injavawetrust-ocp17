package chapter11.understandingexceptions;

public class ThrowingAnException {

    private static void arrayIndexOutOfBoundsException() {
        String[] animals = new String[0];
        System.out.println(animals[0]); // ArrayIndexOutOfBoundsException
    }

    private static void runtimeException() {
        var e = new RuntimeException();
        throw e;
    }

    private static void watchOutNewKeyword() {
        // throw RuntimeException(); // DOES NOT COMPILE
        throw new RuntimeException(); //
    }

    private static void unreachableStatement() {

        try {
            throw new RuntimeException();
            // throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE
        } catch (Exception e) {
        }
    }


}
