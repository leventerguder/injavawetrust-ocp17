package chapter10.working_with_advanced_stream_pipeline_concepts.chaining_optionals;

import java.util.Optional;

public class OptionalFlatMapExample {

    public static void main(String[] args) {

        Optional<Integer> optional = Optional.of(100);

        Optional<Integer> result = optional.flatMap(OptionalFlatMapExample::calculator);
        System.out.println(result.get());

        /*
        This one works because flatMap removes the unnecessary layer.
        In other words, it flattens the result.
        Chaining calls to flatMap() is useful when you want to transform one Optional type to another.
         */

        Optional<Optional<Integer>> result2 = optional.map(OptionalFlatMapExample::calculator);
        Optional<Integer> optional1 = result2.get();
        Integer resultV2 = optional1.get();
        System.out.println(resultV2);
    }

    static Optional<Integer> calculator(Integer opt) {
        return Optional.of(opt * 10);
    }
}
