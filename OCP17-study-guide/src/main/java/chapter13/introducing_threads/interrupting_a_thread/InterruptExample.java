package chapter13.introducing_threads.interrupting_a_thread;

public class InterruptExample {

    public static void main(String[] args) {

        Thread thread = new Thread(

                () -> {
                    try {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("The index of i : " + i);
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

        );
        thread.start();
        thread.interrupt(); // java.lang.InterruptedException

        // Calling  interrupt() on a thread in the TIMED_WAITING or WAITING state
        // causes the main()thread to become RUNNABLE again,
        // triggering an InterruptedException.

        System.out.println("After interrupt invoked...");
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState());

        // In Java Threads, if any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked),
        // calling the interrupt() method on the thread,
        // breaks out the sleeping or waiting state throwing InterruptedException.

        // If the thread is not in the sleeping or waiting state,
        // calling the interrupt() method performs normal behavior
        // and doesn’t interrupt the thread but sets the interrupt flag to true.
    }
}
