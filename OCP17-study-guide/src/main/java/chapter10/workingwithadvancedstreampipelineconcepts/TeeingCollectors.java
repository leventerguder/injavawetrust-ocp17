package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectors {

    public static void main(String[] args) {

        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));
        System.out.println(result);

    }
}
