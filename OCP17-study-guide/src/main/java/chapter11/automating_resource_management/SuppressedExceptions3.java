package chapter11.automating_resource_management;

public class SuppressedExceptions3 {

    public static void main(String[] args) {

        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("Turkeys ran off");
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }

        // Keep in mind that suppressed exceptions apply only to exceptions thrown in the try clause
    }
}
