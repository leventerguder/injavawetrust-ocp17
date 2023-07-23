package chapter05.questions.q07;

public class Q07 {

    public static void main(String[] args) {
        Q07 ref = new Q07();
        ref.method();
    }

    void method() {
        // juggle(); // DOES NOT COMPILE
        System.out.println(juggle(true));
        System.out.println(juggle(true, true));
        System.out.println(juggle(true, true, true));
        // System.out.println(juggle(true, {true, true})); // DOES NOT COMPILE
        System.out.println(juggle(true, new boolean[2]));
    }

    public int juggle(boolean b, boolean... b2) {
        return b2.length;
    }
}
