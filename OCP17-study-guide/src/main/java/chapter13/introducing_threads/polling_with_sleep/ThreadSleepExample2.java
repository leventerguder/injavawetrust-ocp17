package chapter13.introducing_threads.polling_with_sleep;

import java.util.Set;

public class ThreadSleepExample2 {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            System.out.println("before sleep");
            try {
                System.out.println("sleeping...");
                Thread.sleep(5000, 100);
                System.out.println("After sleep");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, "my-thread");

        System.out.println("before thread.start...");
        thread.start();

    }
}
