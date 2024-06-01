package chapter13.applying_annotations.example04;

public class Reindeer {

    // @Music(genres = "Blues", "Jazz") // DOES NOT COMPILE

    @Music(genres = {"Blues", "Jazz"})
    String favorite;

    // @Music(genres =) // DOES NOT COMPILE
    String mostDisliked;

    // @Music(genres = null) // DOES NOT COMPILE
    String other;

    @Music(genres = {})
    String alternate;
}
