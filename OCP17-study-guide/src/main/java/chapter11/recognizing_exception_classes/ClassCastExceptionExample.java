package chapter11.recognizing_exception_classes;

public class ClassCastExceptionExample {

    public static void main(String[] args) {
        String type = "moose";
        Object obj = type;
        Integer number = (Integer) obj; // ClassCastException

        // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
    }
}
