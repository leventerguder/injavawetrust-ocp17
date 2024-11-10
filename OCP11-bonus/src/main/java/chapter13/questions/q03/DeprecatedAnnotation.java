package chapter13.questions.q03;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Deprecated
@Target({ElementType.TYPE_USE})
@Repeatable(DeprecatedAnnotations.class)
public @interface DeprecatedAnnotation {
}
