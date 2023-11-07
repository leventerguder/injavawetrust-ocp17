package chapter13.questions.q08;

import java.util.stream.LongStream;

public class Flavors {
    private static int counter;

    public static void countIceCreamFlavors() {
        counter = 0;
        Runnable task = () -> counter++;
        LongStream.range(0, 500)
                .forEach(m -> new Thread(task).run());
        System.out.println(counter);
    }

    public static void main(String[] args) {
        countIceCreamFlavors();
    }

    // Be wary of run() vs. start() on the exam! The method looks like it executes a task concurrently,
    // but it runs synchronously.


    // Note that if start() had been used instead of run() (or the stream was parallel),
    // then the output would be indeterminate.
}