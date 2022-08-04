package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy5Counting {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}
    }
}
