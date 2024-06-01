package chapter13.creating_custom_annotations.example09;

public @interface Hazard {

    int danger();

    public String description() default "Fire";

    public static final int UNKNOWN = -1;
}
