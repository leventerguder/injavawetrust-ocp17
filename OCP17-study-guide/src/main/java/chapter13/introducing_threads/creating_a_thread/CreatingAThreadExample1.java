package chapter13.introducing_threads.creating_a_thread;

public class CreatingAThreadExample1 {

    public static void main(String[] args) {
        new Thread(() -> System.out.print("Hello")).start();
        System.out.print("World");
    }
}
