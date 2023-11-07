package chapter13.questions.q22;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class BedTime {
    private AtomicInteger s1 = new AtomicInteger(0); // w1
    private int s2 = 0;


    private void countSheep() throws InterruptedException {
        var service = Executors.newSingleThreadExecutor(); // w2

        try {
            for (int i = 0; i < 100; i++) {
                service.execute(() -> {
                    s1.getAndIncrement();
                    s2++;
                });
            }

            //Thread.sleep(60*1000);
            Thread.sleep(2000);
            System.out.println(s1 + " " + s2);
        } finally {
            service.shutdown();
        }

    }

    /*
    The key aspect to notice in the code is that a single-thread executor is used,
    meaning that no task will be executed concurrently.
    Therefore, the results are valid and predictable, with 100 100 being the output
     */

    public static void main(String... nap) throws InterruptedException {
        new BedTime().countSheep();

    }
}