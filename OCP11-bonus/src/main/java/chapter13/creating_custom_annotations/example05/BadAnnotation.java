package chapter13.creating_custom_annotations.example05;

public @interface BadAnnotation {

    // String name() default new String(""); // DOES NOT COMPILE

    String address() default "";

    // String title() default null; // DOES NOT COMPILE
}
