package chapter11.recognizing_exception_classes;

public class NumberFormatExceptionExample {

    public static void main(String[] args) {

        Integer.parseInt("abc");

        // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
    }
}
