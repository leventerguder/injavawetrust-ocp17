package chapter13.introducing_threads.creating_a_thread;

public class MyRunnable implements Runnable {

    private final String parameter;

    public MyRunnable(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run() {
        System.out.println("Important job running in MyRunnable : " + parameter);
    }

}
