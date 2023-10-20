package chapter13.introducing_threads.distinguishing_thread_types;

public class Zoo {

    public static void pause() { // Defines the thread task
        try {
            Thread.sleep(10_000); // Wait for 10 seconds
        } catch (InterruptedException e) {
        }
        System.out.println("Thread finished!");
    }

    public static void main(String[] args) {
        var job = new Thread(() -> pause()); // Create thread
        //job.setDaemon(true);
        job.start();
        System.out.println("Main method finished!");
    }
}
