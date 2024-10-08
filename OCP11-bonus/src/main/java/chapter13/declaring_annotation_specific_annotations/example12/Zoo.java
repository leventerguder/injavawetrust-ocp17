package chapter13.declaring_annotation_specific_annotations.example12;

public class Zoo {

    public static class Monkey {
    }

    @Risks({
            @Risk(danger = "Silly"),
            @Risk(danger = "Aggressive", level = 5),
            @Risk(danger = "Violent", level = 10)
    })
    private Monkey monkey;
}
