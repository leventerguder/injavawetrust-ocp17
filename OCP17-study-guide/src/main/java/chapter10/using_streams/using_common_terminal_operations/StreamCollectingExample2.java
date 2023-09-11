package chapter10.using_streams.using_common_terminal_operations;

import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamCollectingExample2 {


    public static void main(String[] args) {

        collectingMethod1();
        collectingMethod2();
        collectingMethod3();
        collectingMethod4();
    }

    private static void collectingMethod1() {

        System.out.println("### collectingMethod1 ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);

        System.out.println(set); // [f, l, o, w]
    }


    private static void collectingMethod2() {

        System.out.println("### collectingMethod2 ###");

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

    private static void collectingMethod3() {

        System.out.println("### collectingMethod3 ###");

        Stream<String> stream = List.of("w", "o", "l", "f").parallelStream();

        Supplier<TreeSet<String>> supplier = () -> new TreeSet<>();
        BiConsumer<TreeSet<String>, String> accumulator = (TreeSet<String> treeSet, String e) -> treeSet.add(e);
        BiConsumer<TreeSet<String>, TreeSet<String>> combiner = (TreeSet<String> treeSet, TreeSet<String> e) ->
        {
            treeSet.addAll(e);
            System.out.println("triggered! parallel stream.");
        };
        TreeSet<String> set = stream.collect(supplier, accumulator, combiner);

        System.out.println(set); // [f, l, o, w]
    }

    private static void collectingMethod4() {

        System.out.println("### collectingMethod4 ###");

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        List<String> list = stream.collect(
                ArrayList::new,
                ArrayList::add,
                ArrayList::addAll);

        System.out.println(list);
    }

}
