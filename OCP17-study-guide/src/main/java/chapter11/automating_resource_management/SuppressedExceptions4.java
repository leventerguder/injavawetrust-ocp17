package chapter11.automating_resource_management;

public class SuppressedExceptions4 {

    public static void main(String[] args) {

        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new IllegalStateException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println("Suppressed: " + t.getMessage());
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }
    }
}
