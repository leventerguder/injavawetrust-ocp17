package chapter11.automating_resource_management;

public class SuppressedExceptions2 {

    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new RuntimeException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
        }

        // Keep in mind that the catch block looks for matches on the primary exception.
        // Java remembers the suppressed exceptions that go with a primary exception even if we don’t handle them in the code.
    }
}
