package chapter10.working_with_advanced_stream_pipeline_concepts.collecting_results.teeing_collectors;

import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollectors4 {

    public static void main(String[] args) {

        List<String> list = List.of("x", "y", "z");

        MyList myList = list.stream()
                .collect(Collectors.teeing(
                                Collectors.mapping(String::toUpperCase, Collectors.toList()),
                                Collectors.mapping(e -> e, Collectors.toList()),
                                MyList::new
                        )
                );

        System.out.println(myList);
    }

    record MyList(List<String> str, List<String> str2) {
    }
}
