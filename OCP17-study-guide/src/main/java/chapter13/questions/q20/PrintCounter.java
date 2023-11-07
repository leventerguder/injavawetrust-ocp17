package chapter13.questions.q20;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class PrintCounter {
    static int count = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // The key to solving this question is to remember that the execute() method returns void, not a Future object!

        var service = Executors.newSingleThreadExecutor();
        try {
            var r = new ArrayList<Future<?>>();
//            IntStream.iterate(0, i -> i + 1).limit(5).forEach(
//                    i -> r.add(service.execute(() -> {  // DOES NOT COMPILE
//                        count++;
//                    })) // n1
//            );

            for (Future<?> result : r) {
                System.out.print(result.get() + " "); // n2
            }

        } finally {
            service.shutdown();
        }
    }

}
