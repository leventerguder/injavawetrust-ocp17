package chapter13.questions.q10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Furry {

    public String[] value();

    boolean cute() default true;

}