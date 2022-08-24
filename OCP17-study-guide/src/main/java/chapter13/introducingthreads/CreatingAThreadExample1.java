package chapter13.introducingthreads;

public class CreatingAThreadExample1 {

    public static void main(String[] args) {
        new Thread(() -> System.out.print("Hello")).start();
        System.out.print("World");
    }
}
