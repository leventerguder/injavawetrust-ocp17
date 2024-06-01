package chapter13.creating_custom_annotations.example04;

public @interface Exercise {
    int hoursPerDay();

    int startHour() default 6;
}
