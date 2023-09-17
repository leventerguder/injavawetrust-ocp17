package chapter11.recognizing_exception_classes;

public class NumberFormatExceptionExample2 {

    public static void main(String[] args) {

        double d1 = Double.parseDouble("10.5");
        System.out.println(d1);

        double d2 = Double.parseDouble("10,5");
        System.out.println(d2);
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
    }
}
