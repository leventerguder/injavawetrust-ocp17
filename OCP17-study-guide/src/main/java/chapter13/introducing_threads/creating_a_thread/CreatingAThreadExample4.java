package chapter13.introducing_threads.creating_a_thread;

public class CreatingAThreadExample4 {

    public static void main(String[] args) {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        // Calling run() on a Thread or a Runnable does not start a new thread. !!
        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.println("end");
    }
}
