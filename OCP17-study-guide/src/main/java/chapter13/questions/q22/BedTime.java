package chapter13.questions.q22;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class BedTime {
    private AtomicInteger s1 = new AtomicInteger(0); // w1
    private int s2 = 0;


    private void countSheep() throws InterruptedException {
        var service = Executors.newSingleThreadExecutor(); // w2

        try {
            service.execute(() -> {
                s1.getAndIncrement();
                s2++;
            }); // w3

            Thread.sleep(60*1000); System.out.println(s1 + " " + s2);
        } finally {
            service.shutdown();
        }
    }


    public static void main(String... nap) throws InterruptedException {
        new BedTime().countSheep();

    }
}