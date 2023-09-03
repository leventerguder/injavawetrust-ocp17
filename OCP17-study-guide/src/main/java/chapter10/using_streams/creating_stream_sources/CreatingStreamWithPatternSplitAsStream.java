package chapter10.using_streams.creating_stream_sources;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class CreatingStreamWithPatternSplitAsStream {

    public static void main(String[] args) {

        Stream<String> words = Pattern.compile(" ").splitAsStream("a bb ccc");
        words.forEach(System.out::println);
    }

}
