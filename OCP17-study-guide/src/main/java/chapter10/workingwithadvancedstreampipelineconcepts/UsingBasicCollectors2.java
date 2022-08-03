package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectors2 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result); // 5.333333333333333
    }
}
