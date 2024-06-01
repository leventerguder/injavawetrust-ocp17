package chapter13.questions.q24;

public @interface Dance {

    long rhythm() default 66;

    int[] value();

    String track() default "";

    final boolean fast = true;
}
