package chapter13.introducingthreads;

public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        }).start();
        while (counter < 1_000_000) {
            System.out.println("Not reached yet");
        }
        System.out.println("Reached: " + counter);
    }
}