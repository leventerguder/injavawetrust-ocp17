package chapter10.using_streams.creating_stream_sources;

import java.util.stream.Stream;

public class PrintingAStreamReference {

    public static void main(String[] args) {

        Stream<String> stream= Stream.of("value");

        System.out.println(stream);
    }
}
