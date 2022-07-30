package chapter10.workingwithprimitivestreams;

import java.util.stream.IntStream;

public class IntStreamRangeExample {
    public static void main(String[] args) {

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345
    }
}
