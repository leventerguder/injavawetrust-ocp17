package chapter07.questions.q24;


public interface BigCat {
    abstract String getName();

    static int hunt() {
        // getName(); // DOES NOT COMPILE
        return 5;
    }

    default void climb() {
        rest();
    }

    private void roar() {
        getName();
        climb();
        hunt();
    }

    private static boolean sneak() {
        // roar(); // DOES NOT COMPILE
        return true;
    }

    private int rest() {
        return 2;
    }

    ;
}