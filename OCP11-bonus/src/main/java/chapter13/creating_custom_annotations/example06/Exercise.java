package chapter13.creating_custom_annotations.example06;

public @interface Exercise {
    int hoursPerDay();

    int startHour() default 6;
}
