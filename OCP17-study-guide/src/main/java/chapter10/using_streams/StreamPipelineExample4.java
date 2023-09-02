package chapter10.using_streams;

import java.util.stream.Stream;

public class StreamPipelineExample4 {

    public static void main(String[] args) {
        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
        // This one hangs as well until we kill the program.
    }
}
