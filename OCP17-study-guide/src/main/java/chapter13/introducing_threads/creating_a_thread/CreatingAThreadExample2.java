package chapter13.introducing_threads.creating_a_thread;

public class CreatingAThreadExample2 {

    public static void main(String[] args) {

        new Thread(
                () ->
                        System.out.print("Hello " + Thread.currentThread().getName() + "#")
        ).start();

        System.out.print("World " + Thread.currentThread().getName() + "#");

    }
}
