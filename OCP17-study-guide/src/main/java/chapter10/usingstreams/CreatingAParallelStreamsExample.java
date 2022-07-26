package chapter10.usingstreams;

import java.util.List;
import java.util.stream.Stream;

public class CreatingAParallelStreamsExample {

    public static void main(String[] args) {

        var list = List.of("a", "b", "c");
        Stream<String> fromListParallel = list.parallelStream();

    }
}
