package chapter13.declaring_annotation_specific_annotations.example03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
public @interface Flier {
}