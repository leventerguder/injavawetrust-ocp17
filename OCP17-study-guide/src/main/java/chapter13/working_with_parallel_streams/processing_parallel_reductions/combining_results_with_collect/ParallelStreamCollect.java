package chapter13.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_collect;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class ParallelStreamCollect {

    public static void main(String[] args) {
        serialStreamCollectExample();
        parallelStreamCollectExample();
        parallelStreamCollectExample2();
    }

    private static void serialStreamCollectExample() {

        System.out.println("### serialStreamCollectExample ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");

        Supplier<TreeSet<String>> supplier = () -> new TreeSet<>();
        BiConsumer<TreeSet<String>, String> accumulator = (TreeSet<String> treeSet, String e) -> treeSet.add(e);
        BiConsumer<TreeSet<String>, TreeSet<String>> combiner = (TreeSet<String> treeSet, TreeSet<String> e) ->
        {
            treeSet.addAll(e);
            System.out.println("not triggered! not parallel stream.");
        };
        TreeSet<String> set = stream.collect(supplier, accumulator, combiner);

        System.out.println(set); // [f, l, o, w]
    }

    private static void parallelStreamCollectExample() {
        System.out.println("### parallelStreamCollectExample ###");
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
                Set::add,
                Set::addAll);
        System.out.println(set); // [f, l, o, w]
    }

    private static void parallelStreamCollectExample2() {

        System.out.println("### parallelStreamCollectExample2 ###");

        Stream<String> stream = List.of("w", "o", "l", "f").parallelStream();

        Supplier<TreeSet<String>> supplier = () -> new TreeSet<>();
        BiConsumer<TreeSet<String>, String> accumulator = (TreeSet<String> treeSet, String e) -> treeSet.add(e);
        BiConsumer<TreeSet<String>, TreeSet<String>> combiner = (TreeSet<String> treeSet, TreeSet<String> e) ->
        {
            treeSet.addAll(e);
            System.out.println("Invoked!" + Thread.currentThread().getName());
        };
        TreeSet<String> set = stream.collect(supplier, accumulator, combiner);


        System.out.println(set); // [f, l, o, w]
    }
}
