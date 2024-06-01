package chapter13.questions.q12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

enum UnitOfTemp {C, F}

@interface Snow {
    boolean value();
}

@Target(ElementType.METHOD)
public @interface Cold {

    // private Cold() {} // DOES NOT COMPILE

    // int temperature; // DOES NOT COMPILE

    // UnitOfTemp unit default UnitOfTemp.C; // DOES NOT COMPILE

    Snow snow() default @Snow(true);
}
