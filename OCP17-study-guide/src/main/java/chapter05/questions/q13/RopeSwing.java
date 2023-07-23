package chapter05.questions.q13;

import chapter05.questions.q13.rope.*;

import static chapter05.questions.q13.rope.Rope.*;

public class RopeSwing {

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {

        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }

}
