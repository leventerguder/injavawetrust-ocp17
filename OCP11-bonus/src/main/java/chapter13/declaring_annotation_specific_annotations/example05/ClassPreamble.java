package chapter13.declaring_annotation_specific_annotations.example05;

import java.lang.annotation.Documented;

// https://docs.oracle.com/javase/tutorial/java/annotations/declaring.html

//@Documented
public @interface ClassPreamble {

    String author();

    String date();

    int currentRevision() default 1;

    String lastModified() default "N/A";

    String lastModifiedBy() default "N/A";

    String[] reviewers();
}
