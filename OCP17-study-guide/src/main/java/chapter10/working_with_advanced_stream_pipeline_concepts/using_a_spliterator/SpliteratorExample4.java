package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample4 {

    public static void main(String[] args) {

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
        values.add("eleven");

        Spliterator<String> spliterator = values.spliterator();

        Spliterator<String> childSpliterator = spliterator.trySplit();

        System.out.println("### childSpliterator ###");
        childSpliterator.forEachRemaining(System.out::println);

        System.out.println("### otherChildSpliterator ###");
        Spliterator<String> otherChildSpliterator = spliterator.trySplit();
        otherChildSpliterator.forEachRemaining(System.out::println);


        System.out.println("### anotherChildSpliterator ###");
        Spliterator<String> anotherChildSpliterator = spliterator.trySplit();
        anotherChildSpliterator.forEachRemaining(System.out::println);


        System.out.println("### Spliterator ###");
        spliterator.forEachRemaining(System.out::println);
    }
}
