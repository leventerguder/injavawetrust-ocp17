package chapter13.declaring_annotation_specific_annotations.example09;

public class Zoo {

    public static class Monkey {
    }


    // without the @Repeatable annotation, an annotation can be applied only once.

    // @Risk(danger = "Silly")
    // @Risk(danger = "Aggressive", level = 5)
    //@Risk(danger = "Violent", level = 10)
    private Monkey monkey;
}
