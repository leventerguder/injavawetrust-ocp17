package chapter10.using_streams.putting_together_the_pipeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamPipelineExample1 {

    public static void main(String[] args) {

        withoutStreamPipeline();

        withStreamPipeline();

    }

    private static void withoutStreamPipeline() {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list)
            if (name.length() == 4) filtered.add(name);

        Collections.sort(filtered);
        var iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
    }

    private static void withStreamPipeline() {
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }

}
