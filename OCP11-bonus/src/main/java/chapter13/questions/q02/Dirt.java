package chapter13.questions.q02;

import java.lang.annotation.Documented;

enum Color {GREY, BROWN}

@Documented
public @interface Dirt {
    boolean wet();

    // String type() ="unknown"; // DOES NOT COMPILE

    public Color color();

    // private static final int slippery = 5; // DOES NOT COMPILE
}
