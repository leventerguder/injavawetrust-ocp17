package chapter13.declaring_annotation_specific_annotations.example08;

// @Repeatable // DOES NOT COMPILE

// to declare a @Repeatable annotation, you must define a containing annotation type value.
public @interface Risk {
    String danger();

    int level() default 1;
}
