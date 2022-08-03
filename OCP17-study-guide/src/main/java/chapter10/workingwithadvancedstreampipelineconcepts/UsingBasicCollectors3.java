package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingBasicCollectors3 {

    public static void main(String[] args) {

        var ohMy = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result = ohMy
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result); // [tigers]
    }
}
