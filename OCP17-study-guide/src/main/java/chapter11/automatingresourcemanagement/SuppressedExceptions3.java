package chapter11.automatingresourcemanagement;

public class SuppressedExceptions3 {

    public static void main(String[] args) {

        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("Turkeys ran off");
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }

    }
}
