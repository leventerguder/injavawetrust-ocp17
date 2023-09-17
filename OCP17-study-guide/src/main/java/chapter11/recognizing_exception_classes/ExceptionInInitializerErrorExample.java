package chapter11.recognizing_exception_classes;

public class ExceptionInInitializerErrorExample {

    static {
        String str = null;
        System.out.println(str.toUpperCase()); // java.lang.ExceptionInInitializerError
    }

    public static void main(String[] args) {
        System.out.println("ExceptionInInitializerError!");
    }
}
