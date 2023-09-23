package chapter11.questions.q24;

public class SnowStorm {
    static class WalkToSchool implements AutoCloseable {
        public void close() {
            throw new RuntimeException("flurry");
        }
    }

    public static void main(String[] args) {
        WalkToSchool walk1 = new WalkToSchool();
//        try (walk1; WalkToSchool walk2 = new WalkToSchool()) { // DOES NOT COMPILE
//            throw new RuntimeException("blizzard");
//        } catch (Exception e) {
//            System.out.println(e.getMessage()
//                    + " " + e.getSuppressed().length);
//        }
        walk1 = null; // Watch out!
        // walk1 is not EFFECTIVELY final!
    }
}