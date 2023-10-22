package chapter13.introducing_threads.interrupting_a_thread;

public class InterruptExample2 {

    public static void main(String[] args) {

        Thread thread = new Thread(

                () -> {

                    for (int i = 0; i < 5; i++) {
                        System.out.println("The index of i : " + i);
                    }

                }

        );
        thread.start();
        thread.interrupt();

        System.out.println("thread.isInterrupted : " + thread.isInterrupted());
    }
}
