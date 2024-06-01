package chapter13.applying_annotations.example03;

public @interface Injured {
    String veterinarian() default "unassigned";

    String value() default "foot";

    int age() default 1;
}
