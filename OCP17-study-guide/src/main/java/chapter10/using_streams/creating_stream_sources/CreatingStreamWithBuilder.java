package chapter10.using_streams.creating_stream_sources;

import java.util.stream.Stream;

public class CreatingStreamWithBuilder {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .add(5)
                .build();

        stream.forEach(System.out::println);
    }
}
