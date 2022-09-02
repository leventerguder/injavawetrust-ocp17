package chapter13.workingwithparallelstreams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreatingParallelStreams {

    public static void main(String[] args) {
        Collection<Integer> collection = List.of(1, 2);
        Stream<Integer> p1 = collection.stream().parallel();
        Stream<Integer> p2 = collection.parallelStream();
    }
}
