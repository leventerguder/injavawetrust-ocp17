package chapter13.working_with_parallel_streams.processing_parallel_reductions.performing_order_based_tasks;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ParallelStreamUnorderedFindFirst {


    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            unorderedParallelStreamFindFirst();
            unorderedSerialStreamFindFirst();
        }
    }

    private static void unorderedParallelStreamFindFirst() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int findFirst = IntStream.rangeClosed(1, 50)
                    .parallel()
                    .unordered()
                    .skip(5)
                    .limit(10)
                    .findFirst()
                    .getAsInt();
            set.add(findFirst);
        }

        System.out.println("parallelStreamResult: " + set);
    }

    private static void unorderedSerialStreamFindFirst() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            int findFirst = IntStream.rangeClosed(1, 50)
                    .unordered()
                    .skip(5)
                    .limit(10)
                    .findFirst()
                    .getAsInt();
            set.add(findFirst);
        }

        System.out.println("serialStreamResult: " + set);
    }
}
