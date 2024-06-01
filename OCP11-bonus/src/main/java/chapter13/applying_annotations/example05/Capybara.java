package chapter13.applying_annotations.example05;

public class Capybara {

    @Rhythm(value = {"Swing"})
    String favorite;

    @Rhythm(value = "R&B")
    String secondFavorite;

    @Rhythm({"Classical"})
    String mostDisliked;

    @Rhythm("Country")
    String lastDisliked;

    @Rhythm({"Pop", "Jazz", "Rock"})
    String best;

}
