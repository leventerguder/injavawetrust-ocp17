package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator;

import java.util.Arrays;
import java.util.Spliterator;

public class SpliteratorExample5 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Spliterator<Integer> s1 = Arrays.spliterator(arr);
        Spliterator<Integer> s2 = s1.trySplit();

        System.out.println("spliterator 1");
        s1.forEachRemaining(System.out::println);

        System.out.println("spliterator 2");
        s2.forEachRemaining(System.out::println);
    }
}
