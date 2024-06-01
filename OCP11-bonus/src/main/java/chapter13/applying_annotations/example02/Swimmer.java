package chapter13.applying_annotations.example02;

public @interface Swimmer {

    int armLength = 10;

    String stroke();

    String name();

    String favoriteStroke() default "Backstroke";
}
