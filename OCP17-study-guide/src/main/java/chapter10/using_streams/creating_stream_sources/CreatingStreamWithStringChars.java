package chapter10.using_streams.creating_stream_sources;

public class CreatingStreamWithStringChars {

    public static void main(String[] args) {
        "abracadabra".chars()
                .forEach(ch -> System.out.printf("%c ", ch));
    }
}
