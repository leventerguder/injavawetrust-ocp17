package chapter10.using_streams.creating_stream_sources;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamWithArray {

    public static void main(String[] args) {

        String[] values = {"value1", "value2", "value3"};

        Stream.of(values).forEach(System.out::println);

        Arrays.stream(values).forEach(System.out::println);
    }
}
