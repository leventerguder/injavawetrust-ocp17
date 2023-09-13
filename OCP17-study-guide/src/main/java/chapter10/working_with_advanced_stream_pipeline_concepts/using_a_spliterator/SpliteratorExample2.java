package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Muhammed");
        names.add("Mustafa");
        names.add("Mahmut");

        Spliterator<String> spliterator = names.spliterator();


        System.out.println("### before tryAdvance ###");
        boolean result = spliterator.tryAdvance(System.out::println);
        System.out.println(result);
        System.out.println("### after first call tryAdvance ###");
        spliterator.tryAdvance(System.out::println);
        System.out.println("### after second call tryAdvance ###");

        System.out.println(spliterator);

        System.out.println("### The names list ###");
        System.out.println(names);
    }
}
