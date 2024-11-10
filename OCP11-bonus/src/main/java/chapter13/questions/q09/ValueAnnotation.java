package chapter13.questions.q09;


public @interface ValueAnnotation {

    int value() default 0;

    String name() default "undefined";
}
