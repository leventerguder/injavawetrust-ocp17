package chapter11.recognizing_exception_classes;

public class NullPointerExceptionExample2 {

    public static void hop(String name, Integer jump) {
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }

    public static void main(String[] args) {
        hop("Kermit", null);
    }
}

