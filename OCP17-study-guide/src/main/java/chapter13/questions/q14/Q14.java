package chapter13.questions.q14;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class Q14 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Object o1 = new Object();
        Object o2 = new Object();
        var service = Executors.newFixedThreadPool(2);
        var f1 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.print("Tortoise");
                }
            }
        });
        var f2 = service.submit(() -> {
            synchronized (o2) {
                synchronized (o1) {
                    System.out.print("Hare");
                }
            }
        });
        f1.get();
        f2.get();

        // C. If the code does output anything, the order cannot be determined.
    }
}
