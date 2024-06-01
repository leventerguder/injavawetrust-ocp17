package chapter13.creating_custom_annotations.example02;

import java.lang.annotation.Repeatable;

@Repeatable(Foods.class)
public @interface Food {
    String value();
}
