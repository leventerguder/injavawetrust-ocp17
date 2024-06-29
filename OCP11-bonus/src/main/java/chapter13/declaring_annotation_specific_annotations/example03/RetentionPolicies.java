package chapter13.declaring_annotation_specific_annotations.example03;

import java.lang.annotation.Annotation;

public class RetentionPolicies {

    public static void main(String[] args) {
        Annotation a[]
                = new chapter13.declaring_annotation_specific_annotations.example03.A().getClass().getAnnotations();
        Annotation b[]
                = new chapter13.declaring_annotation_specific_annotations.example03.B().getClass().getAnnotations();
        Annotation c[]
                = new chapter13.declaring_annotation_specific_annotations.example03.C().getClass().getAnnotations();


        System.out.println("Number of annotations attached to " + "class A at Runtime: " + a.length);

        System.out.println("Number of annotations attached to " + "class B at Runtime: " + b.length);

        System.out.println("Number of annotations attached to " + "class C at Runtime: " + c.length);

        System.out.println("Annotation attached to class C: " + c[0]);
    }
}

@Flier
class A {
}

@Walker
class B {
}

@Swimmer
class C {
}