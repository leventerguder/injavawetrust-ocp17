package chapter13.questions.q25;

import java.util.*;
import java.util.concurrent.*;

public class CountZooAnimals {

    public static void performCount(int animal) {
        // IMPLEMENTATION OMITTED
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get(1, TimeUnit.DAYS)); // o1
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) throws Exception {
        final var r = new ArrayList<Future<?>>();
        ExecutorService s = Executors.newSingleThreadExecutor();

        try {
            for (int i = 0; i < 10; i++) {
                final int animal = i;
                r.add(s.submit(() -> performCount(animal))); // o2
            }
            r.forEach(f -> printResults(f));
        } finally {
            s.shutdown();
        }

        // The return type of performCount() is void,
        // so submit() is interpreted as being applied to a Runnable expression.

        // While submit(Runnable) does return a Future<?>, calling
        // get() on it always returns null.
    }
}
