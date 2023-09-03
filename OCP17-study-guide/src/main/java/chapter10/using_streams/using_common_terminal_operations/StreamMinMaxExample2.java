package chapter10.using_streams.using_common_terminal_operations;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMinMaxExample2 {

    public static Optional<Double> selectHighestTemperature(Stream<Double> temperatures) {
        return temperatures.max(Double::compareTo);
    }

    public static Optional<Double> selectLowestTemperature(Stream<Double> temperatures) {
        return temperatures.min(Double::compareTo);
    }

    public static void main(String[] args) {

        Optional<Double> highest = selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
        Optional<Double> lowest = selectLowestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
        Optional<Double> empty = selectHighestTemperature(Stream.of());

        System.out.println(highest);
        System.out.println(lowest);
        System.out.println(empty);
    }
}
