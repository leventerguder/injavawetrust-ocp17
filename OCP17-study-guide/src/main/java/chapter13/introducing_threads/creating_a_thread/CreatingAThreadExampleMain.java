package chapter13.introducing_threads.creating_a_thread;

public class CreatingAThreadExampleMain {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();

        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
    }
}
