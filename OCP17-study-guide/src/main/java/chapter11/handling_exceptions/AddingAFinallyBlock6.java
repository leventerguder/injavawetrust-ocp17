package chapter11.handling_exceptions;

public class AddingAFinallyBlock6 {

    public static void main(String[] args) {

        try {
            System.out.println("try-block!");
            System.exit(0);
            System.out.println("Not printed!");
        } finally {
            System.out.print("Never going to get here"); // Not printed
        }
    }
}
