package chapter13.applying_annotations.example05;

public class Giraffe {
    @Music(genres = {"Rock and roll"})
    String mostDisliked;
    @Music(genres = "Classical")
    String favorite;

    @Music(genres = {"Pop", "Rock", "HipHop"})
    String more;
}
