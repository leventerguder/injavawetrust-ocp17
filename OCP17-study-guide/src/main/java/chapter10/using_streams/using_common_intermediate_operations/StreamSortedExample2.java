package chapter10.using_streams.using_common_intermediate_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedExample2 {

    public static void main(String[] args) {

        lengthCompare();

        lengthCompareThenNatural();

        lengthCompareThenNaturalReversed();
    }

    private static void lengthCompare() {
        System.out.println("### lengthCompare ###");
        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        words.stream()
                .distinct()
                .sorted(lengthCompare)
                .forEach(System.out::println);
    }

    private static void lengthCompareThenNatural() {
        System.out.println("### lengthCompareThenNatural ###");
        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        words.stream()
                .distinct()
                .sorted(lengthCompare.thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
    }

    private static void lengthCompareThenNaturalReversed() {
        System.out.println("### lengthCompareThenNaturalReversed ###");
        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        words.stream()
                .distinct()
                .sorted(lengthCompare.thenComparing(String::compareTo).reversed())
                .forEach(System.out::println);
    }

}
