package chapter11.understanding_exceptions;

public class ThrowingAnException {

    public static void main(String[] args) {
        arrayIndexOutOfBoundsException();
    }
    private static void arrayIndexOutOfBoundsException() {
        String[] animals = new String[0];
        System.out.println(animals[0]); // ArrayIndexOutOfBoundsException
    }
}
