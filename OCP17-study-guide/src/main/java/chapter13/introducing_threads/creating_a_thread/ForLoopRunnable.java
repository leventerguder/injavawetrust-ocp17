package chapter13.introducing_threads.creating_a_thread;

public class ForLoopRunnable implements Runnable {
    @Override
    public void run() {
        for (int x = 1; x < 10; x++) {
            System.out.println("Runnable running. " + Thread.currentThread().getName() + " x : " + x);
        }
    }
}
