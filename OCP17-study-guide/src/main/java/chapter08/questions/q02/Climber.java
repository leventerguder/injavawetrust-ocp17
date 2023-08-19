package chapter08.questions.q02;

interface Climb {
    boolean isTooHigh(int height, int limit);
}

public class Climber {
    public static void main(String[] args) {
        // check((h, m) -> h.append(m).isEmpty(), 5); // DOES NOT COMPILE
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else System.out.println("ok");
    }
}
