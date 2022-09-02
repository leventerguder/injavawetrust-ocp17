package chapter13.workingwithparallelstreams;

import java.util.List;

public class ParallelStreamReduce3 {

    public static void main(String[] args) {

        System.out.println(List.of("w", "o", "l", "f").parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf
    }
}
