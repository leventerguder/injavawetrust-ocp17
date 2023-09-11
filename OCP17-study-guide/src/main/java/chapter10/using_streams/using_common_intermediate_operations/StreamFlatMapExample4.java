package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample4 {

    public static void main(String[] args) {

        List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);

        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);

        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListOfInts =
                Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

        System.out.println("The Structure before flattening is : " + listOfListOfInts);

        List<Integer> listOfInts = listOfListOfInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " + listOfInts);
    }
}
