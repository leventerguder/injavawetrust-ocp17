package chapter10.using_streams;

import java.util.stream.Stream;

public class StreamPipelineExample5 {

    public static void main(String[] args) {

        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);


        // This one hangs as well until we kill the program.
        // The filter doesn’t allow anything through, so limit() never sees two elements.
        // This means we have to keep waiting and hope that they show up.
    }
}
