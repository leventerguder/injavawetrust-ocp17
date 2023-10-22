package chapter13.introducing_threads.polling_with_sleep;

import java.util.Set;

public class ThreadSleepExample {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            System.out.println("before sleep");
            try {
                Thread.sleep(5000);
                System.out.println("After sleep");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },"my-thread");

        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();


        Set<Thread> threads = Thread.getAllStackTraces().keySet();
        System.out.printf("%-15s \t %-15s \t %-15s \t %s\n", "Name", "State", "Priority", "isDaemon");
        for (Thread t : threads) {
            System.out.printf("%-15s \t %-15s \t %-15d \t %s\n", t.getName(), t.getState(), t.getPriority(), t.isDaemon());
        }

        // https://www.baeldung.com/java-get-all-threads
    }
}
