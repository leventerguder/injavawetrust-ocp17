package chapter13.questions.q05;

import java.lang.annotation.Inherited;

class Food {
}

@Inherited
public @interface Unexpected {

    // public String rsvp() default null; // DOES NOT COMPILE
    // Food food(); // DOES NOT COMPILE

    public String[] dessert();

    final int numberOfGuests = 5;

    long startTime() default 0L;
}
