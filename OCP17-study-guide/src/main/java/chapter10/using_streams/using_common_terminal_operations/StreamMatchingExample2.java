package chapter10.using_streams.using_common_terminal_operations;

import java.util.stream.Stream;

public class StreamMatchingExample2 {

    public static void main(String[] args) {


        /*
        Unlike the anymatch() method that returns false when the stream is empty,
        the allmatch() and nonematch( ) methods return true if the stream is empty!
         */
        Stream<String> s1 = Stream.empty();
        Stream<String> s2 = Stream.empty();
        Stream<String> s3 = Stream.empty();

        System.out.println(s1.allMatch(p -> p.length() == 3));
        System.out.println(s2.noneMatch(p -> p.length() == 3));
        System.out.println(s3.anyMatch(p -> p.length() == 3));

        /*
        anyMatch

        Returns true if there is any elements in the stream that matches the given predicate.
        Returns false if the stream is empty or if there are no matching elements.
         */

        /*
        allMatch
        Returns true only if all elements in the stream matches the given predicate.
        Returns true if the stream is empty without evaluating the predicate!
         */

        /*
        Returns true only if none of the elements in the stream matches the given predicate.
        Returns true if the stream is empty without evaluating the predicate!
         */

        // https://en.wikipedia.org/wiki/Vacuous_truth
    }
}
