package chapter13.introducing_threads.creating_a_thread;

public class MyThread extends Thread {

    private final String parameter;

    public MyThread(String parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run() {
        System.out.println("Important job running in MyThread : " + parameter);
    }
}
