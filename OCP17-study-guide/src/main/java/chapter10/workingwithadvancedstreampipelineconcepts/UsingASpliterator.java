package chapter10.workingwithadvancedstreampipelineconcepts;

import java.util.List;
import java.util.Spliterator;

public class UsingASpliterator {

    public static void main(String[] args) {

        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");

        Spliterator<String> originalBagOfFood = stream.spliterator();
        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        emmasBag.forEachRemaining(System.out::print); // bird-bunny-cat-

        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        jillsBag.tryAdvance(System.out::print); // dog-
        jillsBag.forEachRemaining(System.out::print); // fish-
        originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse-
    }
}
