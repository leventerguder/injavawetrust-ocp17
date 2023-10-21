package chapter13.introducing_threads.creating_a_thread;

public class IllegalThreadStateExceptionExample {

    public static void main(String[] args) {

        Thread thread = new Thread();
        thread.start();
        thread.start(); // java.lang.IllegalThreadStateException
    }
}
