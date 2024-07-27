package chapter13.declaring_annotation_specific_annotations.example08;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface VertebrateWithoutInherited {
    String value() default "Vertebrate-default";
}
