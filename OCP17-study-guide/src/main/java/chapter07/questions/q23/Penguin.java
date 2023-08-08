package chapter07.questions.q23;

interface Swim {
    default void perform() {
        System.out.print("Swim!");
    }
}

interface Dance {
    default void perform() {
        System.out.print("Dance!");
    }
}

public class Penguin implements Swim, Dance {
    public void perform() {
        System.out.print("Smile!");
    }

    private void doShow() {
        // super.perform();
        // Swim.perform();
        // super.Swim.perform();
        Swim.super.perform();
    }

    public static void main(String[] eggs) {
        new Penguin().doShow();
    }
}