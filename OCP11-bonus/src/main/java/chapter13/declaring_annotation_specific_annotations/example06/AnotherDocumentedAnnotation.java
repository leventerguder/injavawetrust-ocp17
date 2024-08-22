package chapter13.declaring_annotation_specific_annotations.example06;

import java.lang.annotation.Documented;

@Documented
public @interface AnotherDocumentedAnnotation {
    String value();
}
