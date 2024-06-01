package chapter13.questions.q06;

public @interface Driver {

    int[] directions();

    String name() default "";
}

@Driver(directions = 7)
class Taxi {
}

@Driver(directions = {0, 1})
class Taxi2 {
}