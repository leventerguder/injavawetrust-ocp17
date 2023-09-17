package chapter11.understanding_exceptions;

public class ThrowingAnException2 {


    public static void main(String[] args) {
        runtimeException();
    }
    private static void runtimeException() {
        var e = new RuntimeException();
        throw e;
    }
}
