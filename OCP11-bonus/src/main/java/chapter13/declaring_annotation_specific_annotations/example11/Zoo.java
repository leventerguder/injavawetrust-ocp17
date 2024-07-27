package chapter13.declaring_annotation_specific_annotations.example11;

public class Zoo {

    public static class Monkey {
    }

    @Risk(danger = "Silly")
    @Risk(danger = "Aggressive", level = 5)
    @Risk(danger = "Violent", level = 10)
    private Monkey monkey;
}
