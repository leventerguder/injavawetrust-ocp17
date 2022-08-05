package chapter11.understandingexceptions;

public class UncheckedExceptions {

    public static void main(String[] args) {
        fall(null);
    }

    static void fall(String input) {
        System.out.println(input.toLowerCase());
    }
}
