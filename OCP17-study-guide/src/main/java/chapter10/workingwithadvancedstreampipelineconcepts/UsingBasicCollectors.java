package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectors {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears
    }
}
