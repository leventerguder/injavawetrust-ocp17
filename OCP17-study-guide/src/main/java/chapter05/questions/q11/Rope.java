package chapter05.questions.q11;

public class Rope {
    public static void swing() {
        System.out.print("swing");
    }

    public void climb() {
        System.out.println("climb");
    }

    public static void play() {
        swing();
        // climb(); // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        System.out.print("-");
        rope2.play();
    }
}
