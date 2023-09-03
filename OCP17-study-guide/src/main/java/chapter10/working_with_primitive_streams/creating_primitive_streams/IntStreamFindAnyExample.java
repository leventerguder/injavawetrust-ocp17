package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class IntStreamFindAnyExample {
    public static void main(String[] args) {

        IntStream temperatures = IntStream.of(-5, -6, -7, -5, 2, -8, -9);
        IntPredicate positiveTemperature = temp -> temp > 0;
        int temp = temperatures
                .filter(positiveTemperature)
                .findAny()
                .getAsInt();
        System.out.println(temp);

    }
}
