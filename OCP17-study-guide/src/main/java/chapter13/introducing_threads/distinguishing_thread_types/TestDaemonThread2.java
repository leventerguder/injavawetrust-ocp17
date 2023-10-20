package chapter13.introducing_threads.distinguishing_thread_types;

public class TestDaemonThread2 extends Thread {
    public void run() {
        System.out.println("Name: " + Thread.currentThread().getName());
        System.out.println("Daemon: " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();
        t1.start();
        t1.setDaemon(true);//will throw exception here
        // If you want to make a user thread as Daemon,
        // it must not be started otherwise it will throw IllegalThreadStateException.

        // IllegalThreadStateException: if only this thread is active.
        t2.start();
    }
}