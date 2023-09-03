package chapter10.working_with_primitive_streams.creating_primitive_streams;

import java.util.stream.IntStream;

public class IntStreamMatchExample {

    public static void main(String[] args) {

        boolean anyMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);

        boolean allMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);

        boolean noneMatch
                = IntStream.of(-56, -57, -55, -52, -48, -51, -49).noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);
    }
}
