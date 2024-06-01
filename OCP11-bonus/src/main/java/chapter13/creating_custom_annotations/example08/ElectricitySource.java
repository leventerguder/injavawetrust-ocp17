package chapter13.creating_custom_annotations.example08;

public @interface ElectricitySource {

    public int voltage();

    int MIN_VOLTAGE = 2;

    public static final int MAX_VOLTAGE = 18;

    // just like interface variables, annotation variables are implicitly public, static, and final.
    // These constant variables are not considered elements.
}
