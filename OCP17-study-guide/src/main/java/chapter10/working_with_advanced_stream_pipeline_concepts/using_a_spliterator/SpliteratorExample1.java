package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample1 {

    public static void main(String[] args) {

        forEachRemainingMethod1();

        forEachRemainingMethod2();

    }

    private static void forEachRemainingMethod1() {

        System.out.println("### forEachRemainingMethod1 ###");
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Muhammed");
        names.add("Mustafa");
        names.add("Mahmut");

        // Getting Spliterator
        Spliterator<String> namesSpliterator = names.spliterator();

        // Traversing elements
        namesSpliterator.forEachRemaining(System.out::println);
    }

    private static void forEachRemainingMethod2() {

        System.out.println("### forEachRemainingMethod1 ###");
        List<String> names = new ArrayList<>();
        names.add("Ahmet");
        names.add("Muhammed");
        names.add("Mustafa");
        names.add("Mahmut");

        // Getting Spliterator
        Spliterator<String> namesSpliterator = names.spliterator();

        namesSpliterator.tryAdvance(s -> System.out.println(s.toUpperCase()));
        System.out.println("after tryAdvance");
        // Traversing elements
        namesSpliterator.forEachRemaining(System.out::println);
    }
}
