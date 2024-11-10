package chapter13.questions.q03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE_USE})
public @interface DeprecatedAnnotations {
    DeprecatedAnnotation[] value();
}
