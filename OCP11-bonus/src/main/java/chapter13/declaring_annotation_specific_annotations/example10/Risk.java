package chapter13.declaring_annotation_specific_annotations.example10;

public @interface Risk {
    String danger();

    int level() default 1;
}
