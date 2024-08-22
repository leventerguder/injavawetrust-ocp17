package chapter13.declaring_annotation_specific_annotations.example04;

import java.lang.annotation.Documented;

//@Documented
public @interface Hunter {

    String name();

    String nickname();
}
