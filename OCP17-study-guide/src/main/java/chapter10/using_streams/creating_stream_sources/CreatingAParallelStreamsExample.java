package chapter10.using_streams.creating_stream_sources;

import java.util.List;
import java.util.stream.Stream;

public class CreatingAParallelStreamsExample {

    public static void main(String[] args) {

        var list = List.of("a", "b", "c");
        Stream<String> fromListParallel = list.parallelStream();

        System.out.println(fromListParallel.count());
    }
}
