package chapter13.declaring_annotation_specific_annotations.example11;

import java.lang.annotation.Repeatable;

@Repeatable(Risks.class)
public @interface Risk {
    String danger();

    int level() default 1;
}
