package chapter13.creating_custom_annotations.example07;

public @interface Fluffy {
    int cuteness();

    public abstract int softness() default 11;

    // protected Material material(); // DOES NOT COMPILE

    // private String friendly(); // DOES NOT COMPILE

    // final boolean isBunny(); // DOES NOT COMPILE
}