package chapter13.declaring_annotation_specific_annotations.example07;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class InheritedAnnotationExample {

    public static void main(String[] args) {


        printAnnotationState(Mammal.class);
        printAnnotationState(Dolphin.class);
    }

    static void printAnnotationState(AnnotatedElement annotatedElement) {

        System.out.println("----------");
        Annotation[] annotationsArray = annotatedElement.getAnnotations();

        for (Annotation annotation : annotationsArray) {
            System.out.println("Name of the annotation : " + annotation.annotationType());
            System.out.println("Value : " + ((Vertebrate) annotation).value());
        }
        System.out.println("----------\n");
    }
}
