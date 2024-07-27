package chapter13.declaring_annotation_specific_annotations.example07;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Vertebrate {
    String value() default "Vertebrate-default";
}
