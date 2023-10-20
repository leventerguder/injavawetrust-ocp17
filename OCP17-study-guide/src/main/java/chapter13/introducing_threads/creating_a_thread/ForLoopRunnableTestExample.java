package chapter13.introducing_threads.creating_a_thread;

public class ForLoopRunnableTestExample {

    public static void main(String[] args) {
        ForLoopRunnable runnable1 = new ForLoopRunnable();

        Thread thread1 = new Thread(runnable1, "first-thread");
        Thread thread2 = new Thread(runnable1, "second-thread");

        thread1.start();
        thread2.start();
    }
}
