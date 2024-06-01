package chapter13.applying_annotations.example04;

public class Giraffe {
    @Music(genres = {"Rock and roll"})
    String mostDisliked;
    @Music(genres = "Classical")
    String favorite;
}
