package chapter10.questions.q14;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q14 {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.of(1);
        // IntStream is = s.boxed(); // DOES NOT COMPILE
        DoubleStream ds = s.mapToDouble(x -> x);
        // Stream<Integer> s2 = ds.mapToInt(x -> x); // DOES NOT COMPILE
        //s2.forEach(System.out::print);

    }

}
