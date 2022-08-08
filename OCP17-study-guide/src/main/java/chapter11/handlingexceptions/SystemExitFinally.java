package chapter11.handlingexceptions;

public class SystemExitFinally {

    public static void main(String[] args) {

        try {
            System.out.println("Hello World!");
            System.exit(0);
        } finally {
            System.out.print("Never going to get here"); // Not printed
        }
    }
}
