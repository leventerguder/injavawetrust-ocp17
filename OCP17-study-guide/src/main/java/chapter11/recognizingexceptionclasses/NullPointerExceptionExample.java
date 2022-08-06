package chapter11.recognizingexceptionclasses;

public class NullPointerExceptionExample {

    public static void hop(String name, Integer jump) {
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }

    public static void main(String[] args) {
        hop(null, 1);
    }
}

