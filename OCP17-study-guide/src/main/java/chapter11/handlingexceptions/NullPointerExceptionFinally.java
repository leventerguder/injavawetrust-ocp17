package chapter11.handlingexceptions;

public class NullPointerExceptionFinally {

    public static void main(String[] args) {

        nullPointerExceptionInFinally();

    }

    private static String nullPointerExceptionInFinally() {
        LogInfo info = null;

        try {
            System.out.println("try...");
        } finally {
            System.out.println("Before printDetails...");
            info.printDetails();
            System.out.print("Exiting");
            return "zoo";
        }
        // In this example, you see that while a finally block will always be executed, it may not finish.
    }
}

class LogInfo {
    void printDetails() {
    }
}