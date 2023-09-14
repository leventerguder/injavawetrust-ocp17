package chapter10.working_with_advanced_stream_pipeline_concepts.using_a_spliterator;

import java.util.List;
import java.util.Spliterator;

public class UsingASpliterator {

    public static void main(String[] args) {

        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");

        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::print); // bird-bunny-cat-

        System.out.println();
        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::print); // dog-
        System.out.println();
        jillsBag.forEachRemaining(System.out::print); // fish-
        System.out.println();
        originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse-
    }
}
