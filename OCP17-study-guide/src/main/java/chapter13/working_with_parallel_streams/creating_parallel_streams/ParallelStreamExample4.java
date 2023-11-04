package chapter13.working_with_parallel_streams.creating_parallel_streams;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample4 {

    public static void main(String[] args) {

        Instant startTime = Instant.now();

        long count = Stream.iterate(0, n -> n + 1)
                .limit(1_000_000)
                //.parallel()
                .filter(ParallelStreamExample4::isPrime)
                .peek(x -> System.out.format("%s\t", x))
                .count();

        System.out.println("\nTotal: " + count);

        Instant endTime = Instant.now();

        Duration elapsedTime = Duration.between(startTime, endTime);
        System.out.println(elapsedTime.toSeconds());

        // https://mkyong.com/java8/java-8-parallel-streams-examples/
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
