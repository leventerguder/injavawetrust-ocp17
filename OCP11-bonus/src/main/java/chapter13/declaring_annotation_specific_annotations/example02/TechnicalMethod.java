package chapter13.declaring_annotation_specific_annotations.example02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface TechnicalMethod {
}
