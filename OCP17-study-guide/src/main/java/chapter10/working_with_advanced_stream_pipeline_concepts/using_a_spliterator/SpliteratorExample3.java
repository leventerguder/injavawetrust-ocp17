package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExample3 {

    public static void main(String[] args) {

        finiteList();

        infiniteStream();

    }

    private static void finiteList() {
        List<String> values = new ArrayList<>();

        values.add("one");
        values.add("two");
        values.add("three");
        values.add("four");
        values.add("five");
        values.add("six");
        values.add("seven");
        values.add("eight");
        values.add("nine");
        values.add("ten");

        Spliterator<String> spliterator = values.spliterator();

        long estimateSize = spliterator.estimateSize();
        long exactSizeIfKnown = spliterator.getExactSizeIfKnown();

        System.out.println("estimateSize : " + estimateSize);
        System.out.println("exactSizeIfKnown : " + exactSizeIfKnown);

    }


    private static void infiniteStream() {
        var stream = Stream.generate(() -> "infinite");

        Spliterator<String> spliterator = stream.spliterator();


        long estimateSize = spliterator.estimateSize();
        long exactSizeIfKnown = spliterator.getExactSizeIfKnown();

        System.out.println("estimateSize : " + estimateSize);
        System.out.println("exactSizeIfKnown : " + exactSizeIfKnown);
        // If the spliterator has SIZED characteristics, it returns the result of estimateSize().
        // Else, it returns -1. Here is the method signature.
    }
}
