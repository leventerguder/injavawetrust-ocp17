package chapter13.creating_custom_annotations.example06;

public @interface Panda {

    // Integer height(); // DOES NOT COMPILE
    //  While primitive types like int and long are supported,
    //  wrapper classes like Integer and Long are not.

    // String[][] generalInfo();
    // The type String[] is supported, as it is an array of String values,
    // but String[][] is not.

    Size size() default Size.SMALL;

    // Bear friendlyBear();
    // The type of friendlyBear() is Bear (not Class).

    Exercise exercise() default @Exercise(hoursPerDay = 2);
}