package chapter13.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_collect;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamCollect2 {

    public static void main(String[] args) {

        Set<String> letters = List.of("laptop", "monitor", "keyboard", "mouse", "camera", "lamp", "book", "pencil")
                .parallelStream()
                .collect(Collectors.toSet()); // Not a parallel reduction

        // Collectors.toSet() does have the UNORDERED characteristic, it does not have the CONCURRENT characteristic.

        System.out.println(letters);
    }


}
