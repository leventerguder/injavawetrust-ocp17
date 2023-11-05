package chapter13.working_with_parallel_streams.processing_parallel_reductions.combining_results_with_collect;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ParallelStreamCollectToSet {

    public static void main(String[] args) {

        Set<String> letters = List.of("laptop", "monitor", "keyboard", "mouse", "camera", "lamp", "book", "pencil")
                .parallelStream()
                .collect(Collectors.toSet()); // Not a parallel reduction

        // Collectors.toSet() does have the UNORDERED characteristic, it does not have the CONCURRENT characteristic.

        System.out.println(letters);

        System.out.println(Collectors.toSet().characteristics());
    }


}
