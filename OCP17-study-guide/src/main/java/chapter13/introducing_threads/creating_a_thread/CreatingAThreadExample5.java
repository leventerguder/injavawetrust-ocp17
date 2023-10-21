package chapter13.introducing_threads.creating_a_thread;

public class CreatingAThreadExample5 {

    public static void main(String[] args) {

        new Thread(
                () ->
                        System.out.print("Hello " + Thread.currentThread().getName() + "#")
        ).run(); // Not start() method!

        System.out.print("World " + Thread.currentThread().getName() + "#");
        
    }
}
